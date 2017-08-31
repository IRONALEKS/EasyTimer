package Example;

import java.util.Random;

import EasyTimer.Timer;

public class EasyTimerExample
{
	public static void main(String[] args)
	{
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
		System.out.println("TIMER PRECISION MAY DEPEND ON YOUR HARDWARE, JVM WARMUP, PRINT FUNCTION ETC.");
		System.out.println();
		
		Timer timer = new Timer(1);
		
		Random random = new Random();
		
		System.out.println("FIRST TEST(RANDOM SLEEP)");
		System.out.println("////////////////////////");

		//START
		timer.start();
		
		for(int a = 0;a<2;a++)
		{
			try
			{
				int sleepingtime = random.nextInt(250);
				System.out.println("SLEEPING: "+sleepingtime+" MILLISECONDS");
				Thread.sleep(sleepingtime);
			}
			catch (InterruptedException e)
			{
				
			}
		}
		
		//STOP
		timer.end();
		
		System.out.println();
		
		//PRINT
		timer.printFromSecondToNano();
		
		//RESET
		timer.reset();
		
		System.out.println();
		System.out.println("SECOND TEST(2500 MILLIS)");
		System.out.println("////////////////////////");

		//START
		timer.start();
		
		for(int a = 0;a<2;a++)
		{
			try
			{
				System.out.println("SLEEPING: 100 MILLISECONDS");
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				
			}
		}
		
		//STOP
		timer.end();
		
		System.out.println();
		
		//PRINT
		timer.printFromSecondToNano();
	}
}
