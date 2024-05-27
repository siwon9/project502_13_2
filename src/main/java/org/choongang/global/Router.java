package org.choongang.global;

import org.choongang.global.constants.Menu;

/**
 * 사용자가 입력한 메뉴 번호, 문구를 가지고 --> 해당하는 컨트롤러로 연결한다.
 */

public interface Router {
    void change(Menu menu);
    void start();
}
