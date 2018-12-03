package com.rev.CodeChallenge;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CodeChallengeUtility {
	//I am gonna try to right this all in one function. Maybe two if I need to split it
		//Minimum mutable will take in two strings being the start gene and the end gene
		public static int MinimumMutation(String geneStart, String geneEnd, String[] bank)
		{
			//Before we go anywhere I want to make sure that my gene strings aren't already the same
					if(geneStart.equals(geneEnd))
					{
						return 0;
					}
			//Now we know what to look for
			char[] ch = {'A', 'C','G','T'};
			int num = 0;
			
			
			//Use the hashset too store all the genes including bank genes
			Set<String> hash = new HashSet<String>();
			for(String b : bank)
			{
				hash.add(b);
			}
			//The found and queue will be the main players on this stage they will hold on to our sweet sweet variables including our jeans
			Set<String> found = new HashSet<String>();
			Queue<String> queue = new LinkedList<String>();
			queue.offer(geneStart);
			found.add(geneStart);
			
			//Now that all the chaff is out of the way we can start figuring our the problem
			//we will start with a for loop that will continue to run until our queue has been checked through its entirety
			while(!queue.isEmpty())
				{
						int size = queue.size();
						//Honestly did this out of fear that --> would be a setter and that is the only reason I am using this
						while(size --> 0) {
							//Take the last element in the container
							String cur = queue.poll();
							System.out.println(cur);
							//if we have reached the end return the amount
							if(cur.equals(geneEnd))
							{
								System.out.println(cur);
								return num;
							}
							//get the letters of cur
							char[] curArray = cur.toCharArray();
							//Another loop this time we are going through
							for(int i = 0; i < curArray.length; i++)
							{
								char old = curArray[i];
								for(char c : ch) {
									curArray[i] = c;
									String next = new String(curArray); 
									if(!found.contains(next)&&hash.contains(next))
									{
										found.add(next);
										queue.offer(next);
									}
								}
								curArray[i] = old;
							}
						}
						num++;
				}
			//If we fail to mutate the and break out of the four loop without returning the amount needed then we return -1
			return -1;
		}

}
