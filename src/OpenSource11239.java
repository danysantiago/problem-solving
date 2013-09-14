import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//Problem link: http://uva.onlinejudge.org/external/112/11239.html
public class OpenSource11239 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Maps used to keep track of project count and students listed
		HashMap<String, Integer> projectMap = new HashMap<String, Integer>();
		HashMap<String, String> usersMap = new HashMap<String, String>();
		String currProject = "";
		
		while(true) {
			String line = in.nextLine();
			
			if(line.equals("0")) { //Check if last case
				break;
			}
			
			if (line.equals("1")) { //End of case, print answer
				
				//Answer is sorted by amount of students and alphabetical order
				List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(projectMap.entrySet());
				Collections.sort(list, new Comparator<Entry<String, Integer>>() {

					@Override
					public int compare(Entry<String, Integer> a, Entry<String, Integer> b) {
				        //Thanks to Java's comparator this sorting is super easy
						int cmp1 = b.getValue().compareTo(a.getValue());
				        if (cmp1 != 0) {
				            return cmp1;
				        } else {
				            return a.getKey().compareTo(b.getKey());
				        }
					}
				});
				
				//Print output
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
				}
				
				//Clear data
				projectMap.clear();
				usersMap.clear();
				currProject = "";
				continue;
			}
			
			//Check if project or student, regex matches upper-case numeric and space strings
			if(line.matches("[A-Z0-9 ]+")) {
				//String matches project, save it in map, it now becomes
				//current project, following students go here
				currProject = line;
				projectMap.put(line, 0);
			} else {
				//Not project, we have student, we check if student is in another
				//project, if it is, we remove it from that other project and we don't
				//add it here, if student name is twice in the same project, then thats ok
				if(usersMap.containsKey(line)) {
					String userProj = usersMap.get(line);
					if(usersMap.get(line) != null) {
						if(userProj != currProject) {
							projectMap.put(userProj, projectMap.get(userProj) - 1 );
							usersMap.put(line, null);
						}
					}
				} else {
					//Everything cool, increase student count of project, save students
					//selected project
					projectMap.put(currProject, projectMap.get(currProject) + 1);
					usersMap.put(line, currProject);
				}
			}
		}

	}

}
