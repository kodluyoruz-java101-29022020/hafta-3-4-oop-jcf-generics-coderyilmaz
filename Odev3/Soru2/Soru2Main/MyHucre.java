package Soru2Main;


public class MyHucre {
	
	private int veri;
	private MyHucre sagHucre;
	private MyHucre solHucre;
	
	public MyHucre(int veri) {
		this.sagHucre = null;
		this.veri = veri;
		this.solHucre = null;
	}
	
	public int getVeri() {
		return veri;
	}
	public MyHucre getSagHucre() {
		return sagHucre;
	}
	public MyHucre getSolHucre() {
		return solHucre;
	}
	
	public void setVeri(int veri) {
		this.veri = veri;
	}
	public void setSagHucre(MyHucre sagHucre) {
		this.sagHucre = sagHucre;
	}
	public void setSolHucre(MyHucre solHucre) {
		this.solHucre = solHucre;
	}
	
}
