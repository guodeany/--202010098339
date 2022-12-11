package git2022;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class SchoolSystem implements ISignUp{
	public int big;
	public int medium;
	public int small;
	// 记录添加结果
	static List list = new ArrayList();
	
	SchoolSystem(int big, int medium, int small){
		this.big = big;
		this.medium = medium;
		this.small = small;
		list.add(null);
	}
	
	@Override
	public boolean addStudent(int stutype){
		if(stutype == 1 && this.big > 0){
			this.big--;
			return true;
		}else if(stutype == 2 && this.medium > 0){
			this.medium--;
			return true;
		}else if(stutype == 3 && this.small > 0){
			this.small--;
			return true;
		}else{
			return false;
		}
		
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
	}
	
	public static void main(String[] args) throws Exception {
        IParams params = ISignUp.parse();
//        SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params.getPlanSignUp ();
        for (int i = 0; i < plan.size(); i++) {
        	list.add(sc.addStudent(plan.get(i)));
        }
        sc.print();
	}

}
