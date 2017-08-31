package EasyTimer;

public class Timer
{
	private int id;
	private String idstring;
	
	private long start;
	private long end;
	private boolean startcalled = false;
	private boolean endcalled = false;
	private boolean useid = false;
	
	public Timer(int idv)
	{
		id=idv;
		useid=true;
	}
	
	public Timer(String string)
	{
		idstring=string;
		useid=false;
	}
	
	public void start()
	{
		if(!startcalled)
		{
			start=System.nanoTime();
			startcalled=true;
		}
	}
	
	public void end()
	{
		if(!endcalled)
		{
			end=System.nanoTime();
			endcalled = true;
		}
	}
	
	public void printNano()
	{
		if(useid)
		{
			System.out.println("TIMER ID: "+id+" NANO: "+getTimeNano());
		}
		else
		{
			System.out.println("TIMER ID: "+idstring+" NANO: "+getTimeNano());
		}
	}
	
	public void printMicro()
	{
		if(useid)
		{
			System.out.println("TIMER ID: "+id+" MICRO: "+getTimeMicro());
		}
		else
		{
			System.out.println("TIMER ID: "+idstring+" MICRO: "+getTimeMicro());
		}
	}
	
	public void printMilli()
	{
		if(useid)
		{
			System.out.println("TIMER ID: "+id+" MILI: "+getTimeMilli());
		}
		else
		{
			System.out.println("TIMER ID: "+idstring+" MILI: "+getTimeMilli());
		}
	}
	
	public void printSecond()
	{
		if(useid)
		{
			System.out.println("TIMER ID: "+id+" SEC: "+getTimeSecond());
		}
		else
		{
			System.out.println("TIMER ID: "+idstring+" SEC: "+getTimeSecond());
		}
	}
	
	public void printFromNanoToSecond()
	{
		printNano();
		printMicro();
		printMilli();
		printSecond();
	}
	
	public void printFromSecondToNano()
	{
		printSecond();
		printMilli();
		printMicro();
		printNano();
	}
	
	public long getTimeNano()
	{
		return (end-start);
	}
	
	public long getTimeMicro()
	{
		return (end-start)/1000;
	}
	
	public long getTimeMilli()
	{
		return (end-start)/1000000;
	}
	
	public long getTimeSecond()
	{
		return (end-start)/1000000000;
	}
	
	public void reset()
	{
		start = 0;
		end=0;
		startcalled=false;
		endcalled=false;
	}
}
