/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author amdad
 */
public class javatwo {
     public static int V;
        List <Integer> adj[];
     public javatwo(int V)
    {
        this.V = V;
        adj = new ArrayList[V];
        for(int i = 0; i < V; i++)
            adj[i]=new ArrayList<Integer>();
    }
     
    // function to add an edge to graph
    public void addEdge(int u,int v)
    {
        adj[u].add(v);
        System.out.println(u+" "+v);
    }
  public  Integer[] jtopologicalSort()
    {
      Queue<Integer> queue = new LinkedList<Integer>();
        int indegree[] = new int[V];
         
        for(int i = 0; i < V; i++)
        {
            ArrayList<Integer> temp = (ArrayList<Integer>) adj[i];
            for(int node : temp)
            {
                indegree[node]++;
            }
        }
       Vector<List <Integer>> s = new Vector<List<Integer>>();
      // int[][] a=
       Vector tryVec[][]=new Vector[100][100];
       Queue<Integer> q = new LinkedList<Integer>();
       Integer[] Depth=new Integer[100];
       List< Integer > tem=new ArrayList<Integer> ();
        for(int i = 0;i < V; i++)
        {
            if(indegree[i]==0){
                tem.add(i);
                Depth[i]=0;
                q.add(i);
            }
        }
        //System.out.print(tem.size()+"tem ");
        s.add(tem);
        //System.out.print(s.size()+"ss ");
        List<Integer> f=new ArrayList<Integer>();
        f=s.get(0);
        
        //tem.clear();
        int cnt = 0;
        //System.out.print(f.size()+"  f ");
        Vector <Integer> topOrder=new Vector<Integer>();
        
        while(!q.isEmpty())
        {
           
            int u=q.poll();
            topOrder.add(u);
           List< Integer > tem1=new ArrayList<Integer> ();
            for(int node : adj[u])
            {
                if(--indegree[node] == 0){
                    q.add(node);
                    Depth[node]=Depth[u]+1;
                    tem1.add(node);
                }
            }
            s.add(tem1);
           
            cnt++;
        }
         for(int i=0;i<V;i++)
         {
             for(int j=0;j<V;j++)
             {
              //   if(Depth[j]==i)
          //           System.out.print(j+" D ");
             }
            // System.out.println();
         }
        // Check if there was a cycle       
        if(cnt != V)
        {
            
        }
          int c=0;
        // Print topological order
          
        for(int i : topOrder)
        {
           // t[c]=i;
            queue.add(i);
          //  System.out.print(i+" ");
           c++;
        }
        return Depth;
    }
  public Queue<Integer>topoSort()
    {
         Queue<Integer> queue = new LinkedList<Integer>();
        int indegree[] = new int[V];
         
        for(int i = 0; i < V; i++)
        {
            ArrayList<Integer> temp = (ArrayList<Integer>) adj[i];
            for(int node : temp)
            {
                indegree[node]++;
            }
        }
   
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0;i < V; i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }
         
        int cnt = 0;
        
        Vector <Integer> topOrder=new Vector<Integer>();
        while(!q.isEmpty())
        {
           
            int u=q.poll();
            topOrder.add(u);
           
            for(int node : adj[u])
            {
                if(--indegree[node] == 0)
                    q.add(node);
            }
            cnt++;
        }
         
        // Check if there was a cycle       
        if(cnt != V)
        {
           
        }
          int c=0;
        // Print topological order          
        for(int i : topOrder)
        {
              queue.add(i);
           // System.out.print(i+" ");
            //area.append(i+"");
           
        }
        return queue;
    }
    public static Map<Integer, Set<String>> bb = new HashMap<Integer, Set<String>>();
   public static String[] b = new String[100];
    public static Set<String>kai= new HashSet<>();
     public static String[] kaiu = new String[100];
    public static int[][] check = new int[100][100];
      public static List<List<String>> s1 = new ArrayList<>();
   public static    String s;
     public static int[] t=new int[100];
    public static  List<String> l0 = new ArrayList<>();
   
       public static String[] subblock = new String[100];
    public static  List<String> l1 = new ArrayList<>();
    public static Map<Integer,String> m = new HashMap<>();
    public static Map<String,Integer> kaium = new HashMap<>();
    public static Map<Integer,Integer> m2 = new HashMap<>();
     public static Map<Integer, List<String>> m3 = new HashMap<>();
  
  public static String Identifier="[A-Za-z0-9]";
  public static String QualifiedIdentifier=Identifier + ".(Identifier)*";

   public static String digit="[0-9]";
    public static String sign="(+|-)";
    public static String punctuator="([|]|(|)|{|}|*|,|:|=|;|...|#)"; 
    public static String operator="([|]| (|)|.|->|++|--|&|*|+|-|~|!|sizeof|/|%|<<|>>|<|>|<=|>=|==|!=|^|||&&||||?|:|=|*=|/=|%=|+=|-=|<<=|>>=|&=|^=|||=|,|#|##)";
   public static String infix= "(->|&|*|+|-|/|%|<<|>>|< |>|<=|>=|==|!=|^|||&&||||=|*=|/=|%=|+=|-=|<<=|>>=|&=|^=|||=|,)" ;         
  // public static String expression=identifier+"="+"(.*)"+";";
    public static String numericexpression  = "-|++|--"; 
   public static String  type_specifier = "boolean|byte|char|short|int|float|long|double";
   //public static String   numeric_expression  =  "-"  "++"  "--"  )expression ) 
 
   
   
   
     public static  List<String> function(String content)
  {
      //String[] blo = new String[100];
       List<String> blo = new ArrayList<String>();
       String[] regx=new String[100];
                String permission="^[ \\t]*(?:(?:public|protected|private)\\s+)?";
                String keywords="(?:(static|final|native|synchronized|abstract|threadsafe|transient|{#insert zJRgx123GenericsNotInGroup})\\s+){0,}";
    
 //...............................................................
 //patterm natching...................................................................          
         
           Pattern r1 = Pattern.compile("((public|private|protected|static|final|native|synchronized|abstract|transient)+\\s)+[\\$_\\w\\<\\>\\[\\]]*\\s+[\\$_\\w]+\\([^\\)]*\\)?\\s*\\{?[^\\}]*\\}?",Pattern.MULTILINE|Pattern.CASE_INSENSITIVE); 
                 //String st1=st.nextToken("\\n");
                  
                   //b = contents.split("\\n");
                  Matcher m1 = r1.matcher(content);
                  
                    int coun=0;
                    int count=0;
         while (m1.find()) { 
              
                    b[coun]=content.substring(m1.start(), m1.end());
                    // map.put(contents,b.);
                    //System.out.println("dsgfdg"+b[count]);
                  
                
                blo.add(b[coun]);
                 
                // System.out.println("rgroijgoitrj"+b[count]);
                 boolean flag=false;
                    String[] a= b[count].split("\\ |\\,|\\(|\\)|\\;|\\{");
                  for(int ii=0;ii<a.length;ii++)
                  {
                   //System.out.println("rgroijgoitrj"+a[ii]);   
                  }
                  kaiu[count]=a[1];
                   kai.add(a[1]);
                    kaium.put(a[1], count); 
                 // System.out.println("rgroijgoitrj"+kai);
                 
                 //kaium.put(st1, coun)
              //  System.out.println(kaium);
                  coun++;
                 count++;
                   }
         return blo;  
  }
  public static String[] statements(String content)
{
    String[] a=content.split("\\\n");
    for(int i=0;i<a.length;i++){
     System.out.println(a[i]);
         if (a[i].matches("(\\s*[A-Za-z0-9]*\\s*\\)=(\\s*[A-Za-z0-9]*\\s*\\+|\\-|\\*|\\%|\\/\\s*[A-Za-z0-9]*)*$\\;")
                 ) {
         System.out.println("Found value: ");
      } else {
         System.out.println("NO MATCH");
      }
    }
       return a;          
}
  public static javatwo gggg(List<String> a)
    {
         javatwo g=new javatwo(a.size());    
    String[] kaiu=new String[10];
        for(int j=0;j<a.size();j++){
         boolean flag=false;
                    String[] aa= a.get(j).split("\\ |\\,|\\(|\\)|\\;|\\{");
              
                  kaiu[j]=aa[3];
                   kai.add(aa[3]);
                    kaium.put(aa[3], j); 
            bb.put(j,twoo.definations(a.get(j)));
       //area.append("block"+": "+bb.get(1) +"\n");
        //area.append("dfgfhfjsdfdgfd"+kaium+"\n");
     
                   for(int l=0;l<a.size();l++){
                      // bb=twoo.definations(a[i]);
                      // area.append("dgfdgfh "+bb);
                       if(j!=l&&bb.get(j).contains(kaiu[l]))
                       {
                      //System.out.println("dgfdgfh "+l+" "+j+"\n");
                             g.addEdge(j,l);
                           
                        
                           
                       }
                     
              
                      
                 }
    
        }
        return g;
    }
     
      public static void main(String[] args){
 //buffer reader to read file in string form............................... 
          StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\amdad\\Documents\\jjj.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        String contents = sb.toString();
        
       // StringTokenizer st = new StringTokenizer(contents);  
    
        //...................................................
// reguler expression to find declerations.........................................        
                
         List<String> block = new ArrayList<String>();
        block=function(contents);
              //  System.out.println(block.get(1));
               javatwo ggg=new javatwo(block.size());
               // 
                
                //System.out.println(kaium);
                //String[] global={"a","x","y","z"};
               //System.out.println(twoo.sdc(global,contents));
              // System.out.println(twoo.suc(global,contents));
               ggg=gggg(block);
                Queue<Integer> que = new LinkedList<Integer>();
                   Integer[] Depth=new Integer[100];
              Depth=ggg.jtopologicalSort();
              boolean flag;
            flag=false;
              for(int i=0;i<V;i++)
              {
                  int c=0;
                    List<Integer> p = new ArrayList<Integer>();
             for(int j=0;j<V;j++)
             {
                 if(Depth[j]==i){
                    System.out.print(j+" D ");
                      p.add(j);
                      c++;
                 }
             }
              //System.out.print("\n");
              if(c>1){
                 System.out.println(p +" can be run parallely\n");
                 flag=true;
              }
         }
              for(int i=0;i<4;i++)
                  System.out.println(Depth[i]);
               if(flag==false)
              {
                System.out.println( "no parallel part\n");
              }
             que.addAll(ggg.topoSort());
            System.out.println("oreder"+que);
                //statements(contents);
      }
    
}
