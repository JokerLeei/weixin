package com.joker.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: lijiawei04
 * @date: 2021/7/21 1:13 下午
 */
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        log.info("\n----------------------------------------------------------\n" +
                         "                   _ooOoo_\n" +
                         "                  o8888888o\n" +
                         "                  88\" . \"88\n" +
                         "                  (| -_- |)\n" +
                         "                  O\\  =  /O\n" +
                         "               ____/`---'\\____\n" +
                         "             .'  \\\\|     |//  `.\n" +
                         "            /  \\\\|||  :  |||//  \\\n" +
                         "           /  _||||| -:- |||||-  \\\n" +
                         "           |   | \\\\\\  -  /// |   |\n" +
                         "           | \\_|  ''\\---/''  |   |\n" +
                         "           \\  .-\\__  `-`  ___/-. /\n" +
                         "         ___`. .'  /--.--\\  `. . __\n" +
                         "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n" +
                         "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
                         "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n" +
                         "======`-.____`-.___\\_____/___.-`____.-'======\n" +
                         "                   `=---='\n" +
                         "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" +
                         "         佛祖保佑       永无BUG\n" +
                         "----------------------------------------------------------\n\t");
    }

}
