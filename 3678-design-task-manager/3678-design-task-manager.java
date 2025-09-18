class TaskManager {
    public static class task {
        int priority;
        int taskId;
        public task(int priority, int taskId) {
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    public PriorityQueue<task> pq;
    public HashMap<Integer, Integer> taskToUser; // taskId to userId , kaun sa task kauns euser ka h
    public HashMap<Integer, Integer> taskToPriority; // taskId to priority, uss taskid ki priority kya h

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a, b) -> {  // max heap by priority, if priority same then retuen the one with max taskid and if priority not same then return the one woith the max priority
            if (a.priority != b.priority) return b.priority - a.priority;
            else return b.taskId - a.taskId;
        });
        taskToUser = new HashMap<>();
        taskToPriority = new HashMap<>();
        for (List<Integer> t : tasks) {
            int userId = t.get(0);
            int taskId = t.get(1);
            int priority = t.get(2);
            pq.add(new task(priority, taskId));
            taskToUser.put(taskId, userId);
            taskToPriority.put(taskId, priority);
        }
    }

    public void add(int userId, int taskId, int priority) { // guaranteed that taskId dne previously so directly put in
        taskToUser.put(taskId, userId);
        taskToPriority.put(taskId, priority);
        pq.add(new task(priority, taskId));
    }

    public void edit(int taskId, int newPriority) {
        if (!taskToPriority.containsKey(taskId)) return;  // containsKey not contains
        taskToPriority.put(taskId, newPriority);
        pq.add(new task(newPriority, taskId));  // but we r not removing the tasks old priority
    }

    public void rmv(int taskId) {
        taskToPriority.remove(taskId);
        taskToUser.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            task top = pq.peek(); // now we need to check wether this task is valid that is we have not removed or updated it

            if (!taskToUser.containsKey(top.taskId)) {  // if the task already removed fduring rmv but we didnt remove it from pq so its an invalid one
                pq.poll();
                continue;
            }

            int currPriority = taskToPriority.get(top.taskId); // if the tasks priority has been updated  but we dont remove it from the pq(the old priority version)
            if (currPriority != top.priority) {
                pq.poll();
                continue;
            }

            // now its a valid task if it passed the above two cases
            pq.poll(); // remove it from heap
            int userId = taskToUser.get(top.taskId);
            taskToPriority.remove(top.taskId);
            taskToUser.remove(top.taskId);
            return userId;
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
