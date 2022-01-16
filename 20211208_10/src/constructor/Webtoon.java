package constructor;

public class Webtoon {
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	public double points;
	
	public Webtoon(String n, String p, double po) {
		name = n;
		series = 1;
		painter = p;
		complete = false;
		points = po;
	}
		    public void getInfo() {
			    System.out.println("웹툰제목 : " + name + ", 회차 : " + series + 
			    		           ", 작가 : " + painter + 
			    		           ", 완결여부 : " + complete + 
			    		           ", 별점 : " + points);
			}
			public void uploadWebtoon() {
				series += 1;
		    }
			public void completeWebtoon() {
				complete = true;
			}
}