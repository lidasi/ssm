package cwweb.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class PageController {
    
    /**
     * 页头
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/header")
    public String header(HttpServletRequest request) throws IOException {
        return "header";
    }
    
    /**
     * 内容
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/navPage")
    public String navPage(HttpServletRequest request) throws IOException {
        return "navPage";
    }
    
    /**
     * 主页面
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/mainPage")
    public String mainPage(HttpServletRequest request) throws IOException {
        return "mainPage";
    }
    
    /**
     * 入库信息管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/inInventory")
    public String inInventory(HttpServletRequest request) throws IOException {
        return "inInventory";
    }
    
    /**
     * 出库信息管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/outInventory")
    public String outInventory(HttpServletRequest request) throws IOException {
        return "outInventory";
    }
    
    /**
     * 总库存信息
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/tatolInventory")
    public String tatolInventory(HttpServletRequest request) throws IOException {
        return "tatolInventory";
    }
    
    /**
     * 库存履历
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/resumeInventory")
    public String resumeInventory(HttpServletRequest request) throws IOException {
        return "resumeInventory";
    }
    
    /**
     * 销售管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/saleAdmin")
    public String saleAdmin(HttpServletRequest request) throws IOException {
        return "saleAdmin";
    }
    
    /**
     * 财务统计
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/financeStatistics")
    public String financeStatistics(HttpServletRequest request) throws IOException {
        return "financeStatistics";
    }
    
    /**
     * 员工管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/staffAdmin")
    public String staffAdmin(HttpServletRequest request) throws IOException {
        return "staffAdmin";
    }
    
    /**
     * 用户管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/userAdmin")
    public String userAdmin(HttpServletRequest request) throws IOException {
        return "userAdmin";
    }
    
    /**
     * 商品管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/commodityAdmin")
    public String commodityAdmin(HttpServletRequest request) throws IOException {
        return "commodityAdmin";
    }
    
    /**
     * 订单管理
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/orderAdmin")
    public String orderAdmin(HttpServletRequest request) throws IOException {
        return "orderAdmin";
    }
    
    /**
     * 操作测试页
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/operation")
    public String operation(HttpServletRequest request) throws IOException {
        return "operation";
    }
    
   
}
