public class Rangierbahnhof {
    
    private Queue<? extends Zug>  wq;
  	
     public rangierbahnhof() {
	  	wq = new Queue<? extends Zug>();
	  	ice = new Rangiergleis<ICE>();
	  	regio = new Rangiergleis<RB>();
	  
		  
      }
  	
  	public void knopf() {
  		if(wq.front() instanceof ICE) {
  			ice.push(wq.front());
		  } else if(wq.front() instanceof RB) {
		  	regio.push(wq.front());
	  	} else return;
	  	wq.dequeue();
	  }
	  
  }
}
