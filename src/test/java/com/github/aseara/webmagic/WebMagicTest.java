package com.github.aseara.webmagic;

import org.junit.Test;
import us.codecraft.webmagic.Spider;

/**
 * Created by qiujingde on 2017/5/25.
 * web magic 测试
 */
public class WebMagicTest {

    @Test
    public void firstTest() {
        Spider.create(new GithubRepoPageProcessor())
                .addUrl("https://github.com/code4craft")
                .thread(5)
                .run();
    }

}
