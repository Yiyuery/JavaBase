package com.github.kuangcp.sort;

import org.junit.Test;

/**
 * Created by https://github.com/kuangcp
 *
 * @author kuangcp
 * @date 18-3-16  下午10:31
 */
public class SelectTest {

    @Test
    public void testSort() {
        Select.sort(InitBigData.getData("select"));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme