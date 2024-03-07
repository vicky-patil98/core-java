package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class D03P09{
	
    static final int CHARS = 26;

    int V; 

    List<List<Integer>> adj; 
    int[] in;

    // Constructor
    D03P09(int V)
    {
        this.V = V;
        in = new int[V];
        adj = new ArrayList<>(CHARS);
        
        for(int i = 0; i < CHARS; i++)
        {
        adj.add(i, new ArrayList<>());
        }
    }


    void addEdge(int v, int w)
    {
        adj.get(v).add(w);
        in[w]++;
    }


    boolean isEulerianCycle() 
    {
        
        if (!isSC())
            return false;

        for(int i = 0; i < V; i++)
        if (adj.get(i).size() != in[i])
            return false;

        return true;
    }

    boolean isSC() 
    {

        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
        visited[i] = false;

        int n;
        for(n = 0; n < V; n++)
        if (adj.get(n).size() > 0)
            break;

        DFSUtil(n, visited);

        for(int i = 0; i < V; i++)
        if (adj.get(i).size() > 0 && !visited[i])
            return false;


        D03P09 gr = getTranspose();

        for(int i = 0; i < V; i++)
        visited[i] = false;

        gr.DFSUtil(n, visited);

        for(int i = 0; i < V; i++)
        if (adj.get(i).size() > 0 && !visited[i])
            return false;

        return true;
    }

    void DFSUtil(int v, boolean[] visited)
    {
        
        visited[v] = true;

        for(Integer i : adj.get(v))
        if (!visited[i])
        {
            DFSUtil(i, visited);
        }
    }

    D03P09 getTranspose()
    {
        D03P09 g = new D03P09(V);
        for(int v = 0; v < V; v++)
        {
            
        for(Integer i : adj.get(v))
        {
            g.adj.get(i).add(v);
            g.in[v]++;
        }
        }
        return g;
    }

    static boolean canBeChained(String[] arr, int n)
    {
        
        // Create a graph with 'alpha' edges
        D03P09 g = new D03P09(CHARS);

        for(int i = 0; i < n; i++)
        {
        String s = arr[i];
        g.addEdge(s.charAt(0) - 'a', 
                    s.charAt(s.length() - 1) - 'a');
        }
        
        return g.isEulerianCycle();
    }

    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range of Array: ");
        int input1 = sc.nextInt();

        String[] arr1 = new String[input1];
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = sc.next();
        }
        //String[] arr1 = {"abc", "efg", "cde", "ghi","ija"};
        int n1 = arr1.length;
        
        System.out.println((canBeChained(arr1, n1) ?
                        "Yes" : 
                        "No"));

    }
}


