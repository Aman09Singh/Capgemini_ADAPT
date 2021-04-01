
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface satisfied{
	public ArrayList<Assignment4Q2> getList(ArrayList<Assignment4Q2> ord);
}

public class Assignment4Q2 {

    private int totalPrice;
    private String status;
    

    public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Assignment4Q2 [totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
    	satisfied st = (list)->{
    		ArrayList<Assignment4Q2> list2 = new ArrayList<>();
    		for(Assignment4Q2 ob: list) {
    			if((ob.getTotalPrice() > 10000) && (ob.getStatus().equals("ACCEPTED") || ob.getStatus().equals("COMPLETED") )) {
    				list2.add(ob);
    			}
    		}
    		return list2;
    		};
    	/*
    		Iterator<Assignment4Q2> it = list.iterator();
    		while(it.hasNext()) {
    			Assignment4Q2 obj = it.next();
    			if((obj.getTotalPrice() > 10000) && (obj.getStatus().equals("ACCEPTED") || obj.getStatus().equals("COMPLETED") )) {
    				list2.add(obj);
    			}
    		}
    		return list2;
    	};*/
    	ArrayList<Assignment4Q2> lis = st.getList(orders);
    	
    	return lis;
    }
	
    public static void main(String[] args) {
    	Assignment4Q2 od1 = new Assignment4Q2(10020,"ACCEPTED");
    	Assignment4Q2 od2 = new Assignment4Q2(8000,"COMPLETED");
    	Assignment4Q2 od3 = new Assignment4Q2(12000,"ACCEPTED");
    	Assignment4Q2 od4 = new Assignment4Q2(120,"ACCEPTED");
    	Assignment4Q2 od5 = new Assignment4Q2(60000,"COMPLETED");
    	Assignment4Q2 od6 = new Assignment4Q2(1230,"ACCEPTED");
    	Assignment4Q2 od7 = new Assignment4Q2(10002,"ACCEPTED");
    	Assignment4Q2 od8 = new Assignment4Q2(11000,"PROCESSING");
    	Assignment4Q2 od9 = new Assignment4Q2(200,"ACCEPTED");
    	Assignment4Q2 od10 = new Assignment4Q2(3153,"ACCEPTED");
    	Assignment4Q2 od11 = new Assignment4Q2(6464,"ACCEPTED");
    	Assignment4Q2 od12 = new Assignment4Q2(10020,"CACELLED");
    	Assignment4Q2 od13 = new Assignment4Q2(564587,"COMPLETED"); 
    	Assignment4Q2 od14 = new Assignment4Q2(10020,"ACCEPTED");
    	ArrayList<Assignment4Q2> ords = new ArrayList<Assignment4Q2>();
    	ords.add(od1);
    	ords.add(od2);
    	ords.add(od3);
    	ords.add(od4);
    	ords.add(od5);
    	ords.add(od6);
    	ords.add(od7);
    	ords.add(od8);
    	ords.add(od9);
    	ords.add(od10);
    	ords.add(od11);
    	ords.add(od12);
    	ords.add(od13);
    	ords.add(od14);
    	ArrayList<Assignment4Q2> ords2 = listOfOrders(ords);
    	for(Assignment4Q2 ob : ords2) {
    		System.out.println(ob);
    	}
    }
}