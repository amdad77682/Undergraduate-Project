/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1002;
import java.util.*;
import java.util.Enumeration;
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
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author amdad
 */
public class twoo {
   public static Map<Integer, Set<String>> bb = new HashMap<Integer, Set<String>>();
    public static String nondigit="[A-Za-z]";
   public static String digit="[0-9]";
    public static String sign="(+|-)";
    public static String punctuator="([|]|(|)|{|}|*|,|:|=|;|...|#)"; 
    public static String operator="([|]| (|)|.|->|++|--|&|*|+|-|~|!|sizeof|/|%|<<|>>|<|>|<=|>=|==|!=|^|||&&||||?|:|=|*=|/=|%=|+=|-=|<<=|>>=|&=|^=|||=|,|#|##)";
   public static String infix= "(->|&|*|+|-|/|%|<<|>>|< |>|<=|>=|==|!=|^|||&&||||=|*=|/=|%=|+=|-=|<<=|>>=|&=|^=|||=|,)" ;         
   public static String expression=nondigit+"="+"(.*)"+";";
   public static String[] b=new String[10];
    public static Set<String>kai= new HashSet<String>();
     public static String[] kaiu = new String[100];
    public static int[][] check = new int[100][100];
      public static List<List<String>> s1 = new ArrayList<List<String>>();
   public static    String s;
   
    public static  List<String> l0 = new ArrayList<String>();
      public static String[] block = new String[100];
       public static String[] subblock = new String[100];
    public static  List<String> l1 = new ArrayList<String>();
    public static Map<Integer,String> m = new HashMap<Integer,String>();
    public static Map<String,Integer> kaium = new HashMap<String,Integer>();
    public static Map<Integer,Integer> m2 = new HashMap<Integer,Integer>();
     public static Map<Integer, List<String>> m3 = new HashMap<Integer, List<String>>();
    
     
     
     
     
     
     public static  List<String> bloc = new ArrayList<String>();
public static  List<String> blocc = new ArrayList<String>();
public static int t[];
 

  public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
    Set<T> tmp = new TreeSet<T>();
    //System.out.println(setB);
    for (T x : setA)
    { // System.out.println(x);
      if (setB.contains(x))
        tmp.add(x);
    }
     //System.out.println(tmp);
    return tmp;
  }
   public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
    Set<T> tmp = new TreeSet<T>(setA);
    tmp.addAll(setB);
    return tmp;
  }


 public static <T> boolean Intersection(Set<T> setA, Set<T> setB) {
    Set<T> tmp = new TreeSet<T>();
    //System.out.println(setB);
    for (T x : setA)
    { // System.out.println(x);
      if (setB.contains(x))
        tmp.add(x);
    }
     //System.out.println(tmp);
    return tmp.isEmpty();
  }
  public static void dependency( Map<Integer,Set<String>> SUC, Map<Integer,Set<String>> SDC)
  {
       Map<Integer, Integer> dep = new HashMap<Integer, Integer>();
        
       for(int j=0;j<10+1;j++){
           HashSet set1 = new HashSet();
           //Set<T> tmp = new TreeSet<T>();
           set1.add(SUC.get(j));
           System.out.println(j+"succc"+set1);
           
           for(int l=0;l<10;l++){
               HashSet set = new HashSet();
               set.add(SDC.get(l));
                HashSet c = new HashSet();
               if(j!=l){
                    System.out.print(l+"sdccc"+set);
                   for (Iterator iter = set.iterator(); iter.hasNext(); ) {
                     if (set1.contains(iter.next())) {
                         
                        // c.add(iter.next());
                         System.out.print(" true "+c);
                         
                }
        }
               
               }
       }
           System.out.println();
  }
             //return dep;

  }
     public static List<String> function(String content)
  {
      List<String> blo = new ArrayList<String>();
         
       String[] regx=new String[100];
                String datatype="(int|void|char|short|long|float|double)";
                  String validName = "[a-zA-Z0-9_]";       
        //validNames delimeted by white spaces
        String validNameSpace ="["+validName+"|"+validName+"(\\s)*"+"]";        
        //many occurence of the validNameSpace
        String Names = datatype+"("+validNameSpace+")*";        
        String regexp = Names+"("+"(.)*)"; 
               
                regx[1]=regexp+"[\n\\s\t]*\\{([^{}]*|\\{[^{}]*\\})*\\}";//function
                
                
       Set<String> individualContributors = new HashSet<String>();
        List<String> s2 = new ArrayList<String>();
        
        
         Map<String, String> ma = new HashMap<String, String>();
          Map<String, List<String>> map = new HashMap<String, List<String>>();
           Map<String, List<String>> map1 = new HashMap<String, List<String>>();
 //...............................................................
 //patterm natching...................................................................          
          regx[10]=regx[1];
           Pattern r1 = Pattern.compile(regx[10],Pattern.MULTILINE|Pattern.CASE_INSENSITIVE); 
                 //String st1=st.nextToken("\\n");
                  
                   //b = contents.split("\\n");
                  Matcher m1 = r1.matcher(content);
                  
                    int coun=0;
                    int count=0;
         while (m1.find()) { 
              
                    b[coun]=content.substring(m1.start(), m1.end());
                    // map.put(contents,b.);
                   // System.out.println("dsgfdg"+b[count]);
                    s2.add(b[coun]);
                
                blo.add(count,b[coun]);
                 
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
      public static Set<String>definations(String bloc)
     {
         int i=0;
           Set<String> defi = new HashSet<String>();
         //defi=null;
         //System.out.println(block[number]);
        int j=0;
        
          StringTokenizer st = new StringTokenizer(bloc);  
          while (st.hasMoreTokens()) { 
                      //Scanner in = new Scanner(System.in);
           
                 String p=st.nextToken("\\\n");
               String[] regx=new String[100];
                String datatype="(int|void|char|short|long|float|double)";
                  String validName = "[a-zA-Z0-9_]";       
        //validNames delimeted by white spaces
        String validNameSpace ="["+validName+"|"+validName+"(\\s)*"+"]";        
        //many occurence of the validNameSpace
        String Names = datatype+"("+validNameSpace+")*";        
        String regexp = Names+"("+"(.)*)"; 
                 //.........................................
                // Pattern r = Pattern.compile("^\\s*(unsigned|signed)?\\s+(void|int|char|short|long|float|double)\\s+(\\w+)\\([^)]*\\)\\s*;"); 
                 Pattern r1 = Pattern.compile("(?:\\w+\\.)?\\w+(?=\\()");
                // Pattern r2 = Pattern.compile("(?![a-z])[^\\:,>,\\.]([a-z,A-Z]+[_][a-z,A-Z]+)+[(]");
                  Matcher m = r1.matcher(p);
                   while(m.find()){
                     //System.out.format("I found the text" + " \"%s\" starting at "
                      //+"index %d and ending at index %d.%n"
                     //,m.group(),m.start(),m.end());
                     defi.add(p.substring(m.start(), m.end()));
                    // System.out.println(j);
                     //System.out.println(defi[j]);
                      //return defi[j];
                      
                   }
                 
                j++;
                 
          }      
          //System.out.println(defi[j]);
        return defi;
       
       
     }
      
         public static int V;
        List <Integer> adj[];
    public twoo(int V)
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
        //System.out.println(u+" "+v);
    }
  
           // prints a Topological Sort of the complete graph  
     public  Integer[] topologicalSort()
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
       // System.out.print(s.size()+"ss ");
        List<Integer> f=new ArrayList<Integer>();
        f=s.get(0);
        
        //tem.clear();
        int cnt = 0;
      //  System.out.print(f.size()+"  f ");
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
                 
                   //  System.out.print(j+" D ");
             }
             //System.out.println();
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
            System.out.print(i+" ");
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
    public static twoo gggg(List<String> a)
    {
         twoo gg=new twoo(a.size());    
      Set<String>ka= new HashSet<String>();
     // String[] kaiu = new String[100];
       String[] kaiu=new String[10];
         for(int j=0;j<a.size();j++){
           String[] aa= a.get(j).split("\\ |\\,|\\(|\\)|\\;|\\{");
              kaiu[j]=aa[1];
                   kai.add(aa[1]);
                    kaium.put(aa[1], j); 
            bb.put(j,twoo.definations(a.get(j)));
                     for(int l=0;l<a.size();l++){
                      // bb=twoo.definations(a[i]);
                      // area.append("dgfdgfh "+bb);
                       if(j!=l&&bb.get(j).contains(kaiu[l]))
                       {
                         // System.out.println("dgfdgfh "+l+" "+j+"\n");
                            gg.addEdge(j, l);
                          //  g.topologicalSort();
                           // SDC.put(j, SDC.get(l));
                            // SUC.put(j,SUC.get(l));
                       // area.append("suc of "+g+"\n");
                        //area.append("suc of "+SDC+"\n");
                         
                       }
                    
              
                      
                 
                 }
             
        }
        return gg;
    }
    public static  List<String> suuc(String bloc,String[] global)
    {
        List<String> suuc = new ArrayList<String>();
       // String[] suuc=new String[10];
        String[] b=bloc.split("\\n");
        int c=0;
        for(int i=0;i<b.length;i++){
             
     // System.out.println(bloc[i]);
           // System.out.println(b.length);
       for(int k=0;k<global.length;k++){
              if(b[i].contains(global[k])){
               suuc.add(b[i]);
             // System.out.println(suuc[c]);
              c++;
              }
            }
        }
        return suuc;
    }
     public static  Map<Integer,Set<String>> suc(String[] global,String u) {
  Map<Integer,Set<String>> SUC = new HashMap<Integer,Set<String>>();
    // List<String> bloc = new ArrayList<String>();
    
       bloc=function(u);
  for(int m=0;m<bloc.size();m++){
   
    if(bloc.get(m) !=null){
    blocc=suuc(bloc.get(m),global);
    
    // System.out.println("sgfshygj"+bloc[m]); 

           Set<String> suc = new HashSet<String>();

    for(int i=0;i<blocc.size();i++)
    { 
  int k=0;
     
       while(k<4){
            
    Pattern r1 = Pattern.compile("[\\=\\+\\-\\*\\/]"+global[k]);
   //System.out.println("sadsfsfgfgfgffrryy "+global[i]);
           Matcher mm = r1.matcher(blocc.get(i));
                  
                   while(mm.find()){
                    
  //                System.out.println("wefetettwett"+blocc[i]);  
                       
                        try {
                           suc.add(global[k]);
                            SUC.put(m, suc);
                           //System.out.println(suc);
                        }
                         catch(Exception e) {}
                       
                     
                   }
                   //
                   k++;
       }
       }
   //           System.out.println("sdgdsfhgs"+SUC);
      }                        
    
  }
    return SUC;
  }
   public static  Map<Integer,Set<String>>sdc(String[] global,String u) {
  Map<Integer,Set<String>> SDC = new HashMap<Integer,Set<String>>();
  // Map<Integer,Set<String>> SD = new HashMap<Integer,Set<String>>();
      //Set<String> blocc = new HashSet<String>();
 
         bloc=function(u);
       //  bloc.toArray(bloc);
for(int m=0;m<bloc.size();m++){
    blocc=suuc(bloc.get(m),global);
    Set<String> sdc = new HashSet<String>();
 for(int i=0;i<blocc.size();i++)
    { 
      
        int k=0;
   while(k<4){
         
       Pattern r1 = Pattern.compile(global[k]+"\\=");
     // Pattern r12 = Pattern.compile(kaiu[k]);
           Matcher mm = r1.matcher(blocc.get(i));
          Matcher mmm = r1.matcher(blocc.get(i));
           while(mm.find()){
                
                        try {
                            sdc.add(global[k]);
                            SDC.put(m, sdc);
              //             System.out.println(SDC);
                        }
                         catch(Exception e) {}
                   }
                   
           
                   //
            k++; 
            }
       
        }
                                  
    
 
}

    return SDC;
  }
  public static Map<Integer,Set<String>>sd(List<String> a,Map<Integer,Set<String>> SDC)
    {
        Map<Integer,Set<String>> SD = new HashMap<Integer,Set<String>>();
        Set<String>ka= new HashSet<String>();
     // String[] kaiu = new String[100];
       String[] kaiu=new String[10];
         for(int j=0;j<a.size();j++){
           String[] aa= a.get(j).split("\\ |\\,|\\(|\\)|\\;|\\{");
              kaiu[j]=aa[1];
                   kai.add(aa[1]);
                    kaium.put(aa[1], j); 
            bb.put(j,twoo.definations(a.get(j)));
                      HashSet set = new HashSet();
                     for(int l=0;l<a.size();l++){
                         
                      // bb=twoo.definations(a[i]);
                      // area.append("dgfdgfh "+bb);
                       if(j!=l&&bb.get(j).contains(kaiu[l]))
                       {
                          System.out.println(SDC.get(l)); 
                         System.out.println("dgfdgfh "+l+" "+j+"\n");
                          
                          set.add(SDC.get(l));
                         // System.out.println("vvvvvvv"+set);
                         
                       }
                    
              
                      
                 
                 }
                     SD.put(j, set);
         } 
         return SD;
    }
  public static Map<Integer,Set<String>>su(List<String> a,Map<Integer,Set<String>> SUC)
    {
        Map<Integer,Set<String>> SU = new HashMap<Integer,Set<String>>();
        Set<String>ka= new HashSet<String>();
     // String[] kaiu = new String[100];
       String[] kaiu=new String[10];
         for(int j=0;j<a.size();j++){
           String[] aa= a.get(j).split("\\ |\\,|\\(|\\)|\\;|\\{");
              kaiu[j]=aa[1];
                   kai.add(aa[1]);
                    kaium.put(aa[1], j); 
            bb.put(j,twoo.definations(a.get(j)));
                      HashSet set = new HashSet();
                     for(int l=0;l<a.size();l++){
                         
                      // bb=twoo.definations(a[i]);
                      // area.append("dgfdgfh "+bb);
                       if(j!=l&&bb.get(j).contains(kaiu[l]))
                       {
                          System.out.println(SUC.get(l)); 
                         System.out.println("dgfdgfh "+l+" "+j+"\n");
                          
                          set.add(SUC.get(l));
                         // System.out.println("vvvvvvv"+set);
                         
                       }
                    
              
                      
                 
                 }
                     SU.put(j, set);
         } 
         return SU;
    }
 public static void main(String[] args){
 //buffer reader to read file in string form............................... 
          StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\amdad\\Documents\\33.txt"));
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
        String[] global={"G1","G2","G3","G4"};
        // String[] globa="G1|G2|G3|G4".split("\\|");
      //System.out.println("sdgdsfhgs"+ sdc(global,contents));
         //System.out.println("sdgdsfhgs"+ suc(global,contents));
         Set<String> bb = new HashSet<String>();
          List<String> bbb = new ArrayList<String>();
      //  System.out.println( 
               // String[] bbb=new String[10];
               // String[] aaa=new String[10];
                List<String[]> aaa = new ArrayList<String[]>();
            bbb=function(contents);
       // System.out.println(bbb.get(1));
           
           for(int j=0;j<bbb.size();j++){
              aaa.add(bbb.get(j).split("\\ |\\,|\\(|\\)|\\;|\\{"));
                //aaa.add(bbb.get(j).split(""));
              //System.out.println(aaa.get(0)[1]);
                  kaiu[j]=aaa.get(0)[1];
                   kai.add(aaa.get(0)[1]);
                    kaium.put(aaa.get(0)[1], j); 
           // bb.put(j,twoo.definations(bbb[j]));
              
           }
            twoo ggg=new twoo(bbb.size());
              ggg=gggg(bbb);
           
             Map<Integer, Set<String>> SDC = new HashMap<Integer, Set<String>>();
         Map<Integer, Set<String>> SUC = new HashMap<Integer, Set<String>>();
       Map<Integer, Set<String>> SD = new HashMap<Integer, Set<String>>();
         Map<Integer, Set<String>> SU = new HashMap<Integer, Set<String>>();
          //  SDC=sdc(global,contents);
      //  SUC=suc(global,contents);
       // SD=sd(bbb,SDC);
     //  SU=su(bbb,SUC);
       //System.out.println("sd sgfdgsfdh"+SD);
        //System.out.println("suc"+SU);
        Queue<Integer> que = new LinkedList<Integer>();
             que.addAll(ggg.topoSort());
              //.....................................
              Integer[] Depth=new Integer[100];
              Depth=ggg.topologicalSort();
              for(int i=0;i<V;i++)
              {
                  int c=0;
                    List<Integer> p = new ArrayList<Integer>();
             for(int j=0;j<V;j++)
             {
                 if(Depth[j]==i){
                    p.add(j);
                      c++;
                 }
              }
            if(c>1)
                 System.out.println(p +" can be run parally\n");
         }
              //....................................
            System.out.println("oreder"+que);
          //  while(!que.isEmpty())
          //  {
           //     int a=que.peek();
                //System.out.println(que.element());
            //    que.poll();
            //    int b=que.peek();
             //    System.out.println(a+"  "+b);
           //       HashSet set = new HashSet();
            //      HashSet set1 = new HashSet();
            //   set.add(SDC.get(a));
             //  set1.add(SUC.get(b));
               // for (Iterator iter = set.iterator(); iter.hasNext(); ) {
               // if(!set1.contains(set));
               // {
                //   System.out.println(a+"  "+b);
                
                 // }
           // }
        //  }
       // Map<Integer,Integer> dependency=
              //  dependency(SUC,SDC);
 }  
    
}
