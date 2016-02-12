import java.util.*;

import moment.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println(new Moment().fromNow(new Date()));
    System.out.println(new Moment().fromNow(new Date(0)));
    System.out.println(new Moment().fromNow(new Date(1234567890000L)));
    System.out.println(new Moment().fromNow(new Date(12345678900000L)));
    System.out.println(new Moment().fromNow(new Date(new Date().getTime()+8640000)));
    System.out.println(new Moment().fromNow(new Date(new Date().getTime()+86400000)));
  }
}
