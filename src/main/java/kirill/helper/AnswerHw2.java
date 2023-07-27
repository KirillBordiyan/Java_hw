package kirill.helper;

public class AnswerHw2 {
    //SQL task 3
        public StringBuilder answer(String QUERY, String PARAMS){
            String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
            String[] params = paramsNew.split(",");
            StringBuilder stringBuilder = new StringBuilder(QUERY);

            for (int i = 0; i < params.length; i++){
                String[] elements = params[i].replace('"', ' ').split(":");
                if(!"null".equals(elements[1].trim())){
                    stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                    if (i < params.length - 2) stringBuilder.append(" and ");
                }
            }
            return stringBuilder;
        }

    public StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        JSON = JSON.replaceAll("[{}\"\\[\\]]", "");
        JSON = JSON.replaceAll("[:,]", " "); //
        String[] ars = JSON.split(" ");
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i<ars.length; i = i + 6){
            temp.append(ELEMENT1 + ars[i + 1] + ELEMENT2 + ars[i + 3] + ELEMENT3 + ars[i + 5] + "\n");
        }
        System.out.println(temp);
        return temp;
    }
}




