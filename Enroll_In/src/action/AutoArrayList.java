package action;

import java.util.ArrayList;

public class AutoArrayList extends ArrayList{
	
	private Class itemClass;

    public AutoArrayList(Class itemClass,int size) {      
	        this.itemClass = itemClass;   
	        try{
	            for(int i=0; i<size; i++)
	        	  add(itemClass.newInstance());
	        }  catch (Exception e) {      
	            e.printStackTrace();      
	        }      
	} 
}
