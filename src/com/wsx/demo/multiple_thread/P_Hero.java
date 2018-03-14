package com.wsx.demo.multiple_thread;

public class P_Hero {
	// 线程优先级实体类
	public String name;
	public float hp;
	public int damage;

	public void attackHero(P_Hero hero) {
		// 为实现线程优先级效果，注释线程暂停方法
		/*try {
			// 表示进攻需要时间，每次攻击暂停1000ms
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		hero.hp -= damage;
		System.out.printf("%s 正在攻击 %s，%s 的血量变成了 %.0f%n", name, hero.name, hero.name, hero.hp);
		if(hero.isDead()) {
			System.out.println(hero.name + "被击杀！");
		}
	}

	public boolean isDead() {
		return hp <= 0 ? true : false;
	}
}
