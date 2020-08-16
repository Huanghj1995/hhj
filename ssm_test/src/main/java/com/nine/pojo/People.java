package com.nine.pojo;

public class People {

    
    
    /**
     * @author JunhongLi
     * @date 2020/6/27 16:11
     */
    
    public class User {
        //id
        private int id;
        //姓名
        private String name;
        //密码
        private String pwd;
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getPwd() {
            return pwd;
        }
        
        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
        
        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", pwd='" + pwd + '\'' +
                    '}';
        }
    }
}
