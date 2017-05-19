import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class Bowling {
	
	java.util.List<int []> list = new ArrayList<int[]>();
	int strikeChecker = 0;
	int spareChecker = 0;
	boolean [] strike = new boolean[12];
	boolean [] spare = new boolean[12];

	int [] frameRandom(int first, int secound)
	{
		first = throw1();
		secound = throw2(10 - first);
		
		int [] array = {first, secound};
		
		return array;
	}
	int throw1()
	{
		return ThreadLocalRandom.current().nextInt(0,10 + 1);
	}
	int throw2(int j)
	{	
		return ThreadLocalRandom.current().nextInt(0,j + 1);
	}
	
	int[] addFrame(int first, int secound)
	{
		int [] array = {first, secound};
		return array;
	}
	
	java.util.List<int []> game(){

		int [] array;
		for(int i = 0; i < 10; i++)
		{
			int j = 0, k = 0;
			list.add(frameRandom(0,0));
		}
		array = list.get(9);
		if(array[0] == 10)
		{
			list.add(frameRandom(0,0));
			array = list.get(10);
		}
		else if(array[0] + array[1] == 10)
		{
			list.add(frameRandom(0,0));
			array = list.get(10);
		}
		if(array[0] == 10)
		{
			list.add(frameRandom(0,0));
		}
		
		return list;
	}
	boolean strike(int i)
	{
		boolean bool = false;
		if(i == 10)
			bool = true;
		
		return bool;
	}
	boolean spare(int i)
	{
		boolean bool = false;
		
		if(i == 10)
			bool = true;
		return bool;
	}
	int gameScore()
	{	
		int [] array = {0,0};
		int counter = 0;
		for(int i = 0; i < list.size(); i++)
		{
			array = list.get(i);
			counter += array[0] + array[1];
			if(strike(array[0]))
				strike[i] = true;
			else if(spare(array[0] + array[1]))
				spare[i] = true;

		}
			
		counter += multipleStrike();
		counter += multipleSpare();
		return counter;
	}
	int multipleStrike()
	{
		int score = 0;
		int [] array;
		int [] array2;
		for(int i = 0; i < 9; i++)
		{
			if(strike[i] && strike[i + 1] == true)
			{
				array = list.get(i + 1);
				array2 = list.get(i + 2);
				score += array[0] + array[1];
				score += array2[0] + array2[1];
			}
			else if(strike[i] == true && i != 8)
			{
				array = list.get(i + 1);
				score += array[0] + array[1];
			}
		}
		if(strike[8] && strike[10] && spare[9] == true && strike[7] != true)
		{
			array = list.get(9);
			score += array[0] + array[1];
		}
		return score;
	}
	int multipleSpare()
	{
		int score = 0;
		int [] array = {0,0};
		for(int i = 0; i < 9; i++)
		{
			if(spare[i] == true)
			{
				array = list.get(i + 1);
				score += array[0];
			}

		}
		if(strike[7] && strike[8] == true && spare[9] == true)
		{
			array = list.get(9);
			score += array[0];
		}

		return score;
	}
// 81 points
public void init81points()
{
    list.clear();
    list.add(new int[]{1, 5});
    list.add(new int[]{3, 6});
    list.add(new int[]{7, 2});
    list.add(new int[]{3, 6});
    list.add(new int[]{4, 4});
    list.add(new int[]{5, 3});
    list.add(new int[]{3, 3});
    list.add(new int[]{4, 5});
    list.add(new int[]{8, 1});
    list.add(new int[]{2, 6});
}

// 94 points
public void init94points()
{
    list.clear();
    list.add(new int[]{10, 0});
    list.add(new int[]{3, 6});
    list.add(new int[]{7, 2});
    list.add(new int[]{3, 6});
    list.add(new int[]{4, 4});
    list.add(new int[]{5, 3});
    list.add(new int[]{3, 3});
    list.add(new int[]{4, 5});
    list.add(new int[]{8, 1});
    list.add(new int[]{2, 6});
}

// 88 points
public void init88points()
{
    list.clear();
    list.add(new int[]{1, 9});
    list.add(new int[]{3, 6});
    list.add(new int[]{7, 2});
    list.add(new int[]{3, 6});
    list.add(new int[]{4, 4});
    list.add(new int[]{5, 3});
    list.add(new int[]{3, 3});
    list.add(new int[]{4, 5});
    list.add(new int[]{8, 1});
    list.add(new int[]{2, 6});
}

// 103 points
public void init103points()
{
    list.clear();
    list.add(new int[]{10, 0});
    list.add(new int[]{4, 6});
    list.add(new int[]{7, 2});
    list.add(new int[]{3, 6});
    list.add(new int[]{4, 4});
    list.add(new int[]{5, 3});
    list.add(new int[]{3, 3});
    list.add(new int[]{4, 5});
    list.add(new int[]{8, 1});
    list.add(new int[]{2, 6});
}

// 300 points
public void init300points()
{
    list.clear();
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
}

// 279 points
public void init279points()
{
    list.clear();
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{9, 1});
    list.add(new int[]{10, 0});
}

// 135 points
public void init135points()
{
    list.clear();
    list.add(new int[]{6, 3});                                                         
    list.add(new int[]{7, 1});
    list.add(new int[]{8, 2});
    list.add(new int[]{7, 2});
    list.add(new int[]{10, 0});
    list.add(new int[]{6, 2});
    list.add(new int[]{7, 3});
    list.add(new int[]{10, 0});
    list.add(new int[]{8, 0});
    list.add(new int[]{7, 3});
    list.add(new int[]{10, 0});
}

// 98 points
public void init98points()
{
    list.clear();
    list.add(new int[]{8, 2});
    list.add(new int[]{5, 5});
    list.add(new int[]{7, 2});
    list.add(new int[]{3, 6});
    list.add(new int[]{4, 4});
    list.add(new int[]{5, 3});
    list.add(new int[]{3, 3});
    list.add(new int[]{4, 5});
    list.add(new int[]{8, 1});
    list.add(new int[]{2, 6});
}
public void init120points()
{
    list.clear();
    list.add(new int[]{8, 2});
    list.add(new int[]{5, 5});
    list.add(new int[]{7, 2});
    list.add(new int[]{3, 6});
    list.add(new int[]{4, 4});
    list.add(new int[]{5, 3});
    list.add(new int[]{3, 3});
    list.add(new int[]{5, 3});
    list.add(new int[]{10, 0});
    list.add(new int[]{8, 2});
    list.add(new int[]{10, 0});
}
public void init68points()
{
    list.clear();
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{8, 2});
    list.add(new int[]{10, 0});
}
public void init60points()
{
    list.clear();
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 10});
    list.add(new int[]{10, 0});
    list.add(new int[]{8, 2});
    list.add(new int[]{10, 0});
}
public void init0points()
{
    list.clear();
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
    list.add(new int[]{0, 0});
}
public void init100points()
{
    list.clear();
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
}
public void init110points()
{
    list.clear();
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{0, 10});
    list.add(new int[]{10, 0});
}
public void init299points()
{
    list.clear();
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{10, 0});
    list.add(new int[]{9, 0});
}

}

