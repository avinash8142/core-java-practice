package com.web.mis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Covid{
	private String caseDt;
	private Integer confirmed;
	
	public Covid(String caseDt, Integer confirmed) {
		this.caseDt = caseDt;
		this.confirmed = confirmed;
	}
	public String getCaseDt() {
		return caseDt;
	}
	public void setCaseDt(String caseDt) {
		this.caseDt = caseDt;
	}
	public Integer getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "Covid [caseDt=" + caseDt + ", confirmed=" + confirmed + "]";
	}
	
	
}
class CovidWrap{
	private Date caseDt;
	private Integer confirmed;
	public Date getCaseDt() {
		return caseDt;
	}
	public void setCaseDt(Date caseDt) {
		this.caseDt = caseDt;
	}
	public Integer getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "CovidWrap [caseDt=" + caseDt + ", confirmed=" + confirmed + "]";
	}
	
	
}
public class SortListByDate {

	public static void main(String[] args) {
List<Covid> list = Arrays.asList(new Covid("31-05-2020", 1),new Covid("30-05-2020", 10),new Covid("25-05-2020", 8),new Covid("01-06-2020", 20));
Comparator<Covid> comp=(c1,c2)->c1.getCaseDt().compareTo(c2.getCaseDt());
list.sort(comp);
List<CovidWrap> wrap=new ArrayList<>();
SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");

CovidWrap w=null;
for(Covid c:list)
{
	w=new CovidWrap();
	Date d=null;
	try {
		d = f.parse(c.getCaseDt());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	w.setCaseDt(d);
	w.setConfirmed(c.getConfirmed());
	System.out.println(c);
	wrap.add(w);
}
Comparator<CovidWrap> cw=(cw1,cw2)->cw1.getCaseDt().compareTo(cw2.getCaseDt());
Collections.sort(wrap, cw.reversed());
System.out.println("finished");
for(CovidWrap p:wrap)
{
	String caseDt = f.format(p.getCaseDt());
	System.out.println(caseDt);
	System.out.println(p);
}



	}

}
