package hi;

public class cinemaOperation {
    // 1 获取全部电影;(创建属性) 例如 int[] age ;
    private cinema[] movies;

    //构造  有参构造器的作用就是在其他类里面赋值给当前属性的值
    public cinemaOperation(cinema[] movies) {
        this.movies = movies;
    }

    // 2 提供方法
    // 展示全部电影
    public void showMovie() {
        System.out.println("======所有电影信息如下=====");
        for (int i = 0; i < movies.length; i++) {
            cinema c = movies[i];
            System.out.println(c.getId() + "  " + c.getName() + "  " + c.getPrice() + " " + c.getAuthor());
        }
    }

    //根据id 查询电影;
    public void idMovie(int num) {
        for (int i = 0; i < movies.length; i++) {
            cinema m = movies[i];
            if (m.getId() == num) {
                System.out.println("您查询的电影:"+m.getId() +'\n'+ m.getName() + '\n' + m.getPrice() + '\n'+ m.getAuthor());
                //这里使用return 而不是break 原因在于 return 是 结束当前的方法 而break 结束的是当前的循环
                return;
            }
        } System.out.println("输入的ID没有此电影");



    }

}
