package webadv.s16202202;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController//Rest控制器响应Get方式
public class TaskController {
 
	List<String> tasks =Arrays.asList("Maven项目对象模型(POM)，可以通过一小段描述信息来管理项目的构建，报告和文档的项目管理工具软件。",
			"使用 Spring 可插入的 MVC 架构，从而在使用Spring进行WEB开发时，可以选择使用Spring的Spring MVC框架或集成其他MVC开发框架，如Struts1(现在一般不用)，Struts 2(一般老项目使用)等。",
			"jQuery兼容各种主流浏览器，如IE 6.0+、FF 1.5+、Safari 2.0+、Opera 9.0+等。");
    @GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }
}