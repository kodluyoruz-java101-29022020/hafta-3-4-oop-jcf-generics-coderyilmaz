package Soru2Main;

public class MyList {
	
	private MyHucre ilk;
	
	public MyList() {
		this.ilk = null;
	}
	
	public void add(int veri) {
		
		MyHucre hucre = new MyHucre(veri);
		
		if(this.ilk == null) {
			this.ilk = hucre;
		}else {
			this.ilk.setSagHucre(hucre);
		}
		
		hucre = this.ilk;
	}
	
	public int length() {
		
		if(this.ilk == null) {
			return 0;
		}
		int length = 0;
		
		while(this.ilk != null) {
			length++;
			this.ilk = this.ilk.getSagHucre();
		}
		return length;
	}

	@Override
	public String toString() {
		return "MyList [ilk=" + ilk + "]";
	}
	
	
}
