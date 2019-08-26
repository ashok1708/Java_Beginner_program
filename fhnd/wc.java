import java.io.*;

class wc
{
 public static void main(String...arg)
 {
  if(arg.length<1)
  {
   System.err.println("\nrequired parametr missing..\n");
   System.exit(1);
  }

  if(arg.length>1)
  {
   System.err.println("\ntoo many parameters..\n");
   System.exit(1);
  } 

  try
  {
   FileInputStream fs= new FileInputStream(arg[0]);
   int c,w,l;
   c=w=l=0;

   int cur,prv=-1;

   cur=fs.read();
   
   if(cur!=-1)
    l++;
   
   While(cur!=-1)
   {
    c++;

    if(cur=='\r')
    {
     l++;

     if(prv!=-1&& prv!=' '&& prv!='\t' && prv!='\n')
      w++;
    }
    else
    
     if(cur==' '||cur=='\t')
     {
      if(prv!=-1&& prv!=' '&& prv!='\t' && prv!='\n')
       w++;
     }
    
    prv=cur;
    cur=fs.read();
   }
   
   if(prv!=-1&& prv!=' '&& prv!='\t' && prv!='\n')
   w++;

   fs.close();

   System.out.println();
   System.out.println("Counts of Chars  : "+c);
   System.out.println("Counts of words  : "+w);
   System.out.println("Counts of lines  : "+l);
  }

  catch(FileNotFoundException e)
  {
   System.err.println("\nfile not found - "+arg[0]+"\n");
  }
  
  catch(IOException e)
  {
   System.err.println("\ni/o alert  - "+e.getMessage()+"\n");
  }
 }
}



     
