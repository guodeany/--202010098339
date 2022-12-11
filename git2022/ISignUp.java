package git2022;

import java.util.ArrayList;
import java.util.Scanner;

//报名入学接口
public interface ISignUp{
    // 打印输出结果
    public void print();
    // 检查是否有 stuType对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
    public boolean addStudent (int stuType);
    
    // 解析命令行输入的参数（格式），如文档描述
    public static IParams parse() throws Exception{
    	Scanner scn = new Scanner(System.in);
		System.out.println("请输入[SchoolSystem, addStudent, addStudent, addStudent, addStudent]");
		System.out.println("设计要求的参考输入为：     [[1,1,0],[1],[2],[3],[1]]");
		// 1,1,0,1,2,3,1
		String str = scn.next();
		// 过滤非数字字符
		String[] parse = str.split("\\D+");
		ArrayList<Integer> plan=new ArrayList();
//		System.out.println("test=="+parse.length);
//		for(int i = 0; i<parse.length; i++){
//			System.out.println(parse[i]);
//		}
		for(int x=4; x <parse.length; x++){
			plan.add(Integer.parseInt(parse[x]));
		}
		return new IParams () {

			@Override
			public int getBig() {
				// TODO 自动生成的方法存根
				return Integer.parseInt(parse[1]);
			}

			@Override
			public int getMedium() {
				// TODO 自动生成的方法存根
				return Integer.parseInt(parse[2]);
			}

			@Override
			public int getSmall() {
				// TODO 自动生成的方法存根
				return Integer.parseInt(parse[3]);
			}

			@Override
			public ArrayList<Integer> getPlanSignUp() {
				// TODO 自动生成的方法存根
				return plan;
			}
			
		};
    }
}
