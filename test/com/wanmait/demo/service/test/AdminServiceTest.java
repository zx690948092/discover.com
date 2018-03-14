package com.wanmait.demo.service.test;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wanmait.demo.service.UserService;
import com.wanmait.demo.vo.User;

public class AdminServiceTest {

/*	private static AdminService adminService;

	@BeforeClass
	// 鐢ˊBeforeClass娉ㄨВ鐨勬柟娉�鍦ㄧ被鍔犺浇鍚庢墽琛屼竴閬�
	public static void beforeClass() {

		// 鍔犺浇spring
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		adminService = (AdminService) ac.getBean("adminService");

	}

	@Before
	// 鐢ˊBefore鏉ユ敞瑙ｇ殑鏂规硶鍦ㄦ瘡涓祴璇曟柟娉曟墽琛屽墠閮戒細鎵ц
	public void before() {
		// System.out.println("before........");
	}

	@Test
	public void testFindAll() {
		List<Admin> admins = adminService.findAll();
		for (Admin admin : admins) {
			System.out.println(admin.getName());
		}
	}

	@Test
	public void testFindById() {
		Admin admin = adminService.findById(3);
		System.out.println(admin.getName());
	}*/
}
