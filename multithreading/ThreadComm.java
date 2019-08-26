class Agent
{
 private int val;
 private boolean valset;

 synchronized void set(int val)
 {
  if(valset)
  {
   try
   {
    wait();
   }
   catch(InterruptedException e){}
  }

  this.val=val;
  valset=true;
  notify();
 }
 
 synchronized int get()
 {
  if(!valset)
  {
   try
   {
    wait();
   }
   catch(InterruptedException e){}
  }

  valset=false;  
  notify();
  return val;
 }
}

class Consumer extends Thread
{
 private static final String words[]={"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ",};
 private Agent agent;

 Consumer(Agent agent)
 {
  this.agent=agent;
  start();
 }

 public void run()
 {
  while(true)
  {
   int n=agent.get();
   if(n==-1) break;

   System.out.println();

   for(char c : String.valueOf(n).toCharArray())
   {
    for(char x : words[c-48].toCharArray())
    {
     System.out.print(x);
     try
     {
      Thread.sleep(10);
     }
     catch(InterruptedException e){}
    }
   }
  }
 }
}
  

class Producer extends Thread
{
 private Agent agent;
 private int lo,hi;

 Producer(Agent agent,int lo,int hi)
 {
  this.lo=lo;
  this.hi=hi;
  this.agent=agent;
  
  start();
 }

 public void run()
 {
  while(lo<=hi)
  {
   
  agent.set(lo);
  
   lo++;
  }
  agent.set(-1);
 }
}

class ThreadComm
{
 public static void main(String...arg)
 {
  Agent agent = new Agent();
  new Producer(agent,20451,20460);
  new Consumer(agent);
 

 }
}

