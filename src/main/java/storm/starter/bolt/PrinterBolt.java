package storm.starter.bolt;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;
import org.apache.log4j.Logger;
import sun.tools.tree.ThisExpression;


public class PrinterBolt extends BaseBasicBolt {

    private String prefix;

    public PrinterBolt(String prefix){
        this.prefix = prefix;
    }


    @Override
  public void execute(Tuple tuple, BasicOutputCollector collector) {

        //TODO print out the tuple

        //This bolt does not emit any values further, only print object values to the console
  }

  public void declareOutputFields(OutputFieldsDeclarer ofd) {
      //This bolt does not emit any values. Hence, it does not declare any fields for its output.
  }

}
