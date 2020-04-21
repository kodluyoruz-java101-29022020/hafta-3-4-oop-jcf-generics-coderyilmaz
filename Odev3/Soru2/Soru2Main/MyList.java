package Soru2Main;

public class MyList {
	
	private MyHucre ilk;
	private MyHucre son;
	
	public MyList() {
		this.ilk = null;
		this.son = null;
	}
	
	public void add(int veri) {  

		MyHucre hucre = new MyHucre(veri);  
  
        if(ilk == null) {  
        	
            ilk = hucre;
            son = hucre;

            ilk.setSolHucre(null);  

            son.setSagHucre(null); 
        }  
        else {  

        	son.setSagHucre(hucre);  

        	hucre.setSolHucre(son);  

        	son = hucre;
        	
        	son.setSagHucre(null);
        }  
    }  
	
	
	public int length() {
		MyHucre hucre = ilk;
		
		int length = 0;
		
		if(ilk == null) {
			return 0;
		}
		
		while(hucre != null) {  
			length++;
			hucre = hucre.getSagHucre();
		}
		return length;
	}
	
	public String toString() {  

		MyHucre hucre = ilk;  
        
		if(ilk == null) {  
            return "Liste Bos !";  
        }  
        
        StringBuilder builder = new StringBuilder();
        builder.append("List = [ ");
		
        while(hucre != null) {  
			builder.append(hucre.getVeri());
			builder.append(" ");
            hucre = hucre.getSagHucre();
        }  
		
		builder.append("]");

		return builder.toString();
    } 
	
}
