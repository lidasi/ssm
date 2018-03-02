package cwweb.com.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

public class DateUtil {
    public static final String SECOND_IN_MILLI = "1000";
    public static final String MINUTE_IN_MILLI = "60000";
    public static final String HOUR_IN_MILLI = "3600000";
    public static final String DAY_IN_MILLI = "86400000";
    public static final int DEFAULT_SCALE = 3;
    
    public static final String FMT_sdf17 = "yyyyMMddHHmmssSSS";
    private static final String FMT_sdf14_L = "yyyy-MM-dd HH:mm:ss";
    private static final String FMT_sdf14 = "yyyyHHddHHmmss";
    public static final String FMT_sdf8 = "yyyyMMdd";
    public static final String FMT_sdf8_L = "yyyy-MM-dd";
    public static final String FMT_sdf6 = "yyMMdd";
    
    /* 
     * 将时间戳转换为时间
     */
    public String fmt_sdf14_L(String requestString) throws Exception{
        String dateString = requestString.substring(0,14);
        /*long dateString = System.currentTimeMillis();
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FMT_sdf14_L);*/
        /*long dateStringFormat = new Long(dateString);*/
        /*Date date = new Date();
        date.setTime(dateStringFormat);*/
        //res = simpleDateFormat.format(new Date(Long.parseLong(String.valueOf(dateString))));*/
        
        SimpleDateFormat formatter1=new SimpleDateFormat(FMT_sdf14_L); 
        SimpleDateFormat formatter2=new SimpleDateFormat(FMT_sdf14); 
        dateString=formatter1.format(formatter2.parse(dateString)); 
        
        return dateString;
    }
    
    /**
     * 获取当前系统时间的17位记过 yyyymmddhhMMssSSS
     * 
     * @return
     */
    public static String getNow17() {
        return DateFormatUtils.format(new Date(), DateUtil.FMT_sdf17);
    }
    
    /**
     * 获取当前系统时间的14位记过 yyyymmddhhMMss
     * 
     * @return
     */
    public static String getNow14() {
        return DateFormatUtils.format(new Date(), DateUtil.FMT_sdf14);
    }

    /**
     * 获取系统时间
     * 
     * @param format
     *            指定的格式
     * @return String 系统时间
     */
    public static String getSystemDateStr(String format) {
        String result = "";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat(format);
        result = df.format(cal.getTime());
        return result;
    }

    /**
     * 根据指定格式把时间值转为Calendar对象
     * 
     * @param time
     *            时间值
     * @param pattern
     *            指定格式
     * @return Calendar 转换后的Calendar对象
     */
    public static Calendar stringToCal(String time, String pattern) {
        Calendar result = Calendar.getInstance();
        try {
            result.setTime(DateUtils.parseDate(time, pattern));
        } catch (ParseException e) {
            
            return null;
        }
        return result;
    }

    /**
     * 获取给定的两个时间的间隔（可以指定单位）
     * 
     * @param time1
     *            时间1
     * @param time2
     *            时间2
     * @param unit
     *            间隔单位（只能是：天、小时、分钟、秒、毫秒）
     * @return BigDecimal类型的时间间隔
     */
    public static BigDecimal getPeriod(String time1, String time2, int unit) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, Integer.valueOf(time1.substring(0, 4)));
        cal1.set(Calendar.MONTH, Integer.valueOf(time1.substring(4, 6)) - 1);
        cal1.set(Calendar.DATE, Integer.valueOf(time1.substring(6, 8)));
        cal1.set(Calendar.HOUR, Integer.valueOf(time1.substring(8, 10)));
        cal1.set(Calendar.MINUTE, Integer.valueOf(time1.substring(10, 12)));
        cal1.set(Calendar.SECOND, Integer.valueOf(time1.substring(12, 14)));
        cal1.set(Calendar.MILLISECOND, Integer.valueOf(time1.substring(14, 17)));

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, Integer.valueOf(time2.substring(0, 4)));
        cal2.set(Calendar.MONTH, Integer.valueOf(time2.substring(4, 6)) - 1);
        cal2.set(Calendar.DATE, Integer.valueOf(time2.substring(6, 8)));
        cal2.set(Calendar.HOUR, Integer.valueOf(time2.substring(8, 10)));
        cal2.set(Calendar.MINUTE, Integer.valueOf(time2.substring(10, 12)));
        cal2.set(Calendar.SECOND, Integer.valueOf(time2.substring(12, 14)));
        cal2.set(Calendar.MILLISECOND, Integer.valueOf(time2.substring(14, 17)));

        BigDecimal bdTime1 = new BigDecimal(String.valueOf(cal1.getTimeInMillis()));
        BigDecimal bdTime2 = new BigDecimal(String.valueOf(cal2.getTimeInMillis()));

        BigDecimal bdRet = null;
        BigDecimal bdDeltaInMilli = bdTime1.subtract(bdTime2);
        switch (unit) {
        case Calendar.MILLISECOND:
            bdRet = bdDeltaInMilli;
            break;
        case Calendar.SECOND:
            bdRet = bdDeltaInMilli.divide(new BigDecimal(SECOND_IN_MILLI), DEFAULT_SCALE, RoundingMode.HALF_UP);
            break;
        case Calendar.MINUTE:
            bdRet = bdDeltaInMilli.divide(new BigDecimal(MINUTE_IN_MILLI), DEFAULT_SCALE, RoundingMode.HALF_UP);
            break;
        case Calendar.HOUR:
            bdRet = bdDeltaInMilli.divide(new BigDecimal(HOUR_IN_MILLI), DEFAULT_SCALE, RoundingMode.HALF_UP);
            break;
        case Calendar.DATE:
            bdRet = bdDeltaInMilli.divide(new BigDecimal(DAY_IN_MILLI), DEFAULT_SCALE, RoundingMode.HALF_UP);
            break;
        default:
        }
        return bdRet;
    }

    /**
     * 根据当前日期，获取第二天日期
     * 
     * @param date
     *            当前日期
     * @return 第二天的日期
     * @throws ParseException
     */
    public static Date getNextDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        return cal.getTime();
    }
    
    /**
     * 获取24小时前的时间
     * @return
     */
    public static String getLastDayTime() {
        Long millis = System.currentTimeMillis() - 86400 * 1000;
        return DateFormatUtils.format(millis, DateUtil.FMT_sdf17);
    }

    /**
     * 根据指定的输入输出格式转换日期字符串
     * 
     * @param time
     *            日期字符串
     * @param inFmt
     *            指定输入日期字符串的格式
     * @param outFmt
     *            指定输出日期字符串的格式
     * @return 转换后日期字符串
     */
    public static String convertTimeStr(String time, String inFmt, String outFmt) {
        String strRet = null;
        SimpleDateFormat sdfIn = new SimpleDateFormat(inFmt);
        SimpleDateFormat sdfOut = new SimpleDateFormat(outFmt);
        try {
            Date dateSource = sdfIn.parse(time);
            strRet = sdfOut.format(dateSource);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return strRet;
    }
    
    /**
     * @param date
     * @param inFmt
     * @return Long
     */
    public static Long strToTime(String date, String inFmt) {
        try {
            return new SimpleDateFormat(inFmt).parse(date).getTime();
        } catch (ParseException e) {
            return 0L;
        }
    }
    
    /**
     * 根据起始日期和有效期限算出结束日期
     * 
     * @param date
     *            起始日期 CCYY-MM-DD
     * @return 结束日期 CCYY-MM-DD
     * @throws ParseException
     */
    public static String calEndDate(Date startDate, String period, String unit) {
        GregorianCalendar gc =new GregorianCalendar();
        SimpleDateFormat sf  =new SimpleDateFormat("yyyyMMddHHmmss");
        gc.setTime(startDate);
        switch (unit) {
            case "1": 
                gc.add(5, Integer.parseInt(period));
                break;
            case "2": 
                gc.add(3, Integer.parseInt(period));
                break; 
            case "3": 
                gc.add(2, Integer.parseInt(period));
                break;
            case "4": 
                gc.add(2, 3*6*Integer.parseInt(period));
                break; 
            case "5": 
                gc.add(2, 6*Integer.parseInt(period));
                break;
            case "6": 
                gc.add(1, Integer.parseInt(period));
                break; 
        };
        return sf.format(gc.getTime());
    }
    
    /**
     * 根据起始日期和天数计算出下个工作日（除周六周日）是第几天
     * 
     * @param startDay 起始日期
     * @param days 天数
     * 
     * @return 计算后天数
     */
    public static String addWorkDay(String startDay, String days) {
        
        String result = null; 
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
            Date date = sdf.parse(startDay);  

            Calendar cal = Calendar.getInstance();
            Calendar oldCal = Calendar.getInstance();
            oldCal.setTime(date);
            cal.setTime(date);
            
            int mod = Integer.parseInt(days) % 5;
            int other = Integer.parseInt(days) / 5 * 7;
            
            for (int i = 0; i < mod;) {
                cal.add(Calendar.DATE, 1);
                switch (cal.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.SUNDAY:
                case Calendar.SATURDAY:
                    break;
                default:
                    i++;
                    break;
                }
            }
            if (other > 0) {
                cal.add(Calendar.DATE, other);
            }
            
            result = String.valueOf((cal.getTimeInMillis() - oldCal.getTimeInMillis()) / (1000 * 60 * 60 * 24));
        } catch (Exception e) {  
            
        }
        
        return result;
    }
}
