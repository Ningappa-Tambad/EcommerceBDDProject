package BddCucumber.Example1.dummy.utils;
import org.openqa.selenium.Cookie;
import io.restassured.http.Cookies;

import java.util.ArrayList;
import java.util.List;

public class CookieUtils {
    public List<Cookie> convertRestAssuredCookieToSeleniumCookie(Cookies cookies) {
        List<io.restassured.http.Cookie> restAssuredCookies = cookies.asList();
        List<Cookie> seleniumCookies = new ArrayList<>();

        for (io.restassured.http.Cookie cookie : restAssuredCookies) {
            Cookie seleniumCookie = new Cookie.Builder(cookie.getName(), cookie.getValue())
                    .domain(cookie.getDomain() != null ? cookie.getDomain() : "")
                    .path(cookie.getPath() != null ? cookie.getPath() : "/")
                    .expiresOn(cookie.getExpiryDate())
                    .isSecure(cookie.isSecured())
                    .build();
            seleniumCookies.add(seleniumCookie);
        }
        return seleniumCookies;
    }
}
