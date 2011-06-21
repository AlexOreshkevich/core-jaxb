/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.prognoz.exjaxb.test;

import by.prognoz.exjaxb.parser.ExJAXBParser;
import by.prognoz.exjaxb.test.adhoc.Adhocroot;
import java.util.HashMap;

/**
 * SchemaTestParser
 * 
 * @author oreshkevich
 */
public class SchemaTestParser implements ExJAXBParser<Adhocroot> {

  @Override
  public HashMap<String, String> getNamespacePrefixMap() {

    HashMap<String, String> map = new HashMap<String, String>();
    map.put("http://www.prognoz.ru/Adhoc", "xsi");

    return map;
  }

  @Override
  public String getNamespace() {
    return "http://www.prognoz.ru/Adhoc";
  }

  @Override
  public String getRootTagName() {
    return "Adhoc";
  }

  @Override
  public String getSchemaInstancePrefix() {
    return "xsi";
  }
}
