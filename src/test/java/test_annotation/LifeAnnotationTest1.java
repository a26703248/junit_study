package test_annotation;

import org.junit.jupiter.api.*;

public class LifeAnnotationTest1 {

    /**
     * 第一次初始化會執行
     */
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    /**
     * 每次測試方法前都會執行
     */
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    /**
     * 每次測試方法後都會執行(即使測試方法有發生斷言失敗或發生Exception)
     */
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    /**
     * 最後測試方法都完成會執行(即使測試方法有發生斷言失敗或發生Exception)
     */
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

    @DisplayName("測試方法01")
    @Test
    public void testMethod01(){
        System.out.println("testMethod01");
    }


    @DisplayName("測試方法02")
    @Test
    public void testMethod02(){
        System.out.println("testMethod02");
    }

    @Disabled("由於xx原因，關閉 testIsDog 測試")
    @Test
    public void testMethod03() {
        System.out.println("disabled testMethod03");
    }
}
