package wang.sunce.util;

import java.sql.Types;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Sunce on 2017/3/25 0025.
 */
public class EntityUtil {
    Properties properties ;

    public void start(EntityUtil app){
        try{
            app.createEntity();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("出错了");
        }

        app.start(app);
    }

    /**
     * 首字母大写
     * @Description  首字母大写
     * @param str
     * @return
     */
    public static String upperStr(String str){
        char[] ars = str.toCharArray();
        ars[0] -= 32;
        return String.valueOf(ars);
    }

    public void createEntity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入表名");
        String tableName = sc.nextLine();
        System.out.println();
        System.out.println("package wang.sunce.entity;");
        System.out.println();
        System.out.println("import java.util.Date;");
        System.out.println();
        System.out.println("import javax.persistence.Column;");
        System.out.println("import javax.persistence.Entity;");
        System.out.println("import javax.persistence.Table;");
        System.out.println("import javax.persistence.Temporal;");
        System.out.println("import javax.persistence.TemporalType;");
        System.out.println();
        System.out.println("import wang.sunce.common.BaseEntity;");
        System.out.println();
        System.out.println("@Entity");
        System.out.println("@Table(name = \""+tableName+"\")");
        String className = "";
        if(tableName.contains("_")){
            for(String s : tableName.split("_")){
                className += upperStr(s);
            }
        }else{
            className = upperStr(tableName);
        }
        System.out.println("public class "+className+" extends BaseEntity<Long>{");
        System.out.println();
        System.out.println("private static final long serialVersionUID = 1232427668166267147L;");
        List<Field> list = DataSourceUtil.getInstacne().getTableColumnDetail(tableName);
        if(list!=null && !list.isEmpty()){
            for(Field f:list){
                if("id".equalsIgnoreCase(f.getColumnName())){
                    continue;
                }
                if("status".equalsIgnoreCase(f.getColumnName())){
                    continue;
                }
                if("remark".equalsIgnoreCase(f.getColumnName())){
                    continue;
                }
                if("create_time".equalsIgnoreCase(f.getColumnName())){
                    continue;
                }
                if("last_update_time".equalsIgnoreCase(f.getColumnName())){
                    continue;
                }
                if("optimistic".equalsIgnoreCase(f.getColumnName())){
                    continue;
                }
                String str = "private ";
                int type = f.getColumnDataType();
                String typeName = null;
                switch(type){
                    case Types.DECIMAL:typeName="Double";break;
                    case Types.DOUBLE:typeName="Double";break;
                    case Types.INTEGER:typeName="Long";break;
                    case Types.VARCHAR:typeName="String";break;
                    case Types.TIMESTAMP:typeName="Date";break;
                    case Types.DATE:typeName="Date";break;
                    default:typeName="String";break;
                }
                str += typeName+" "+getNewName(f.getColumnName())+";";
                System.out.println("/** "+f.getColumnComment()+" */");
                System.out.println(str);
                System.out.println();
            }
            //=========================get & set==============================
            for(Field field : list){
                if("id".equalsIgnoreCase(field.getColumnName())){
                    continue;
                }
                if("create_time".equalsIgnoreCase(field.getColumnName())){
                    continue;
                }
                if("last_update_time".equalsIgnoreCase(field.getColumnName())){
                    continue;
                }
                if("optimistic".equalsIgnoreCase(field.getColumnName())){
                    continue;
                }
                if("optimistic_sync".equalsIgnoreCase(field.getColumnName())){
                    continue;
                }
                String typeName = null;
                int type = field.getColumnDataType();
                switch(type){
                    case Types.DECIMAL:typeName="Double";break;
                    case Types.DOUBLE:typeName="Double";break;
                    case Types.INTEGER:typeName="Long";break;
                    case Types.VARCHAR:typeName="String";break;
                    case Types.TIMESTAMP:typeName="Date";break;
                    case Types.DATE:typeName="Date";break;
                    default:typeName="String";break;
                }
                String comment;
                if(field.getColumnDataType()==Types.VARCHAR){
                    comment = "@Column(name = \""+field.getColumnName()+"\", length = "+field.getColumnLength()+")";
                }else if(field.getColumnDataType()==Types.TIMESTAMP){
                    System.out.println("@Temporal(TemporalType.TIMESTAMP)");
                    comment = "@Column(name = \""+field.getColumnName()+"\")";
                }else{
                    comment = "@Column(name = \""+field.getColumnName()+"\")";
                }
                System.out.println(comment);

                String totalstr = getNewName(field.getColumnName());
                String begin = totalstr.substring(0,1).toUpperCase();
                String end = totalstr.substring(1,totalstr.length());

                String getStrFirst = "public "+typeName+" get"+begin+end+"() {";
                String getStrSecond = "  return "+totalstr+";";
                String getStrThird = "}";

                System.out.println(getStrFirst);
                System.out.println(getStrSecond);
                System.out.println(getStrThird);

                String setStrFirst = "public void set"+begin+end+"("+typeName+" "+totalstr+") {";
                String setStrSecond = "  this."+totalstr+" = "+totalstr+";";
                String setStrThird = "}";
                System.out.println();
                System.out.println(setStrFirst);
                System.out.println(setStrSecond);
                System.out.println(setStrThird);
                System.out.println();
                //
            }
            System.out.println("}");
        }
    }

    public static String getNewName(String oldName){
        if(oldName.endsWith("_")){
            oldName = oldName.substring(0,oldName.length()-1);
        }
        oldName=oldName.toLowerCase();
        int index=oldName.indexOf("_");
        if(index>0){
            oldName=changeName(oldName,index);
        }
        return oldName;
    }
    public static String changeName(String oldName,int index){
        StringBuffer sb = new StringBuffer();
        String oldNameHead=oldName.substring(0,index);
        String oldNameMiddle=oldName.substring(index+1,index+2).toUpperCase();
        String oldNameEnd=oldName.substring(index+2,oldName.length());
        sb.append(oldNameHead);
        sb.append(oldNameMiddle);
        sb.append(oldNameEnd);
        oldName=sb.toString();
        int index2=oldName.indexOf("_");
        if(index2>0){
            oldName=changeName(oldName,index2);
        }
        return oldName;
    }

    public static void main(String[] args) {
        EntityUtil app = new EntityUtil();
        app.start(app);
    }

}
