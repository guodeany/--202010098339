package git2022;

import java.util.ArrayList;

public interface IParams {
    // 获取大班名额
    public int getBig();
    // 获取中班名额
    public int getMedium();
    // 获取小班名额
    public int getSmall();
    // 获取入学序列，例如 [1 2 2 3] 表示 依次报名入学一名大班学生，中班学生，中班学生，小班学生
    public ArrayList<Integer> getPlanSignUp ();
}
