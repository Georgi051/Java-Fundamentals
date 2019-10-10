package OldFinalExamTasks;

        import java.util.*;

public class OnTheWayToAnnapurna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> storyBook = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String[] input = command.split("->");
            String typeComand = input[0];
            String story = input[1];

            if (typeComand.equals("Add")){
                String[] item = input[2].split(",");
                if (!storyBook.containsKey(story)){
                    List<String> value = new ArrayList<>();
                    value.addAll(Arrays.asList(item));
                    storyBook.put(story,value);
                }else {
                    List<String> newData = storyBook.get(story);
                    newData.addAll(Arrays.asList(item));
                    storyBook.put(story,newData);
                }
            }else if (typeComand.equals("Remove")){
                storyBook.remove(story);
            }
            command = scanner.nextLine();
        }
        System.out.println("Stores list:");
        storyBook.entrySet().stream().sorted((e1,e2)->{
            int sort = Integer.compare(e2.getValue().size(),e1.getValue().size());

            if (sort == 0){
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(entry -> {
            System.out.printf("%s\n",entry.getKey());
            List<String> items = entry.getValue();

            for (int i = 0; i < items.size(); i++) {
                System.out.printf("<<%s>>\n",entry.getValue().get(i));
            }
        });
    }
}
