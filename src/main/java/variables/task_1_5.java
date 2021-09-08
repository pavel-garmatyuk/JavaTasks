package variables;
/** Задание 1.5
 Напишите фрагмент класса, который будет присваивать значение 7.5
 переменной х, а затем будет присваивать переменным а и Ь значения
 вдвое и второе (соответственно) большие, чем значение переменной х.
 */
public class task_1_5 {
    public static void main(String[] args) {
        float x = 7.5f;
        float a = 2 * x;
        float b = 3 * x;
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
}
