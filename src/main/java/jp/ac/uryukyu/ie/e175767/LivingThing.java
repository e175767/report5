package jp.ac.uryukyu.ie.e175767;
/**
 * ダメージを計算するクラス
 * String name; //名前
 * int hitPoint; //体力
 * int attack; //攻撃
 * boolean dead; //生死確認
 * Created by e195708 on 2019/12/22.
 */


public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public String getName(){
        return name;
    }


    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void attack(LivingThing opponent){
        int damage = (int) (Math.random() * attack);
        if (dead) {
            damage = 0;
        } else {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }

    }
}













