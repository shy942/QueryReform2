package adjacent.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import config.StaticData;

public class AdjacentListMaker {

	String title;
	HashMap<String, ArrayList<String>> adjacentMap;
	int windowSize = 2;

	public AdjacentListMaker(String title) {
		this.title = StaticData.PROCESSEDBUGREPORTS + "/new/" + title;
		this.adjacentMap = new HashMap<>();
	}

	public AdjacentListMaker(String title, int windowSize) {
		this.title = StaticData.QRData + "/csv/" + title;
		this.adjacentMap = new HashMap<>();
		this.windowSize = windowSize;
	}

	protected void addAdjacencyLinks(String previousToken, String nextToken,
			String currentToken) {
		// adding adjacency lists
		// now add the graph nodes
		
		if (!adjacentMap.containsKey(currentToken)) {
			adjacentMap.put(currentToken, new ArrayList<String>());
		}
		if (!adjacentMap.containsKey(previousToken) && !previousToken.isEmpty()) {
			adjacentMap.put(previousToken, new ArrayList<String>());
		}
		if (!adjacentMap.containsKey(nextToken) && !nextToken.isEmpty()) {
			adjacentMap.put(nextToken, new ArrayList<String>());
		}

		 System.out.println(currentToken);
		// now adding the adjacency links

		// adding previous token
		if (!previousToken.isEmpty()) {
			ArrayList<String> currAdj = adjacentMap.get(currentToken);
			//check duplicate token
			if(!currAdj.contains(previousToken))
			{
			currAdj.add(previousToken);
			adjacentMap.put(currentToken, currAdj);
			}
		}

		// adding the next token
		if (!nextToken.isEmpty()) {
			ArrayList<String> currAdj = adjacentMap.get(currentToken);
			//check duplicate token
			if(!currAdj.contains(nextToken))
			{
			currAdj.add(nextToken);
			adjacentMap.put(currentToken, currAdj);
			}
		}
	}

	protected void addAdjacencies(String[] words) {
		// adding the adjacencies
		for (int index = 0; index < words.length; index++) {

			String currentToken = words[index];

			if (this.windowSize == 2) {
				String previousToken = new String();
				String nextToken = new String();
				
				if (index > 0)
					previousToken = words[index - 1];
				if (index < words.length - 1)
					nextToken = words[index + 1];
				addAdjacencyLinks(previousToken, nextToken, currentToken);

			} else if (windowSize == 4) {
				String previousToken = new String();
				String nextToken = new String();
				String ppreviousToken = new String();
				String nnextToken = new String();
				
				
				if (index > 0)
					previousToken = words[index - 1];
				if (index < words.length - 1)
					nextToken = words[index + 1];
				addAdjacencyLinks(previousToken, nextToken, currentToken);

				if (index > 1)
					ppreviousToken = words[index - 2];
				if (index < words.length - 2)
					nnextToken = words[index + 2];
				addAdjacencyLinks(ppreviousToken, nnextToken, currentToken);
			}
		}
	}

	protected void getAdjacentStats() {
		// collect statistics on the adjacent list
		int sumadj = 0;
		for (String key : this.adjacentMap.keySet()) {
			sumadj += this.adjacentMap.get(key).size();
			System.out.println(key+" "+this.adjacentMap.get(key).size());
		}
		System.out.println("Average size:" + (double) sumadj
				/ this.adjacentMap.size());
	}

	protected void makeAdjacentList() {
		// preparing word adjacent list
		try {
			Scanner scanner = new Scanner(new File(this.title));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] words = line.split("\\s+");
				this.addAdjacencies(words);
			}
			scanner.close();
			System.out.println("Total keys:" + adjacentMap.keySet().size());
			this.getAdjacentStats();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public HashMap<String, ArrayList<String>> getAdjacentList() {
		// collecting adjacent list
		this.makeAdjacentList();
		showAdjacentList();
		return this.adjacentMap;
	}
	
	protected void showAdjacentList()
	{
		int count=0;
		for(String key:this.adjacentMap.keySet()){
			System.out.println(key+":"+ this.adjacentMap.get(key));
			count++;
			//if(count==200)break;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "inputAll.txt";
		new AdjacentListMaker(title).getAdjacentList();
	}
}
