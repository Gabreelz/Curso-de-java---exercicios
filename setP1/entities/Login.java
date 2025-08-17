package setP1.entities;

import java.sql.Date;

public class Login {
   private String user;
   private Date datelogin;

   public Login(String user, Date datelogin){
    this.user = user;
    this.datelogin = datelogin;
   }

   public String getUser(){
    return user;
   }

   public void setUser(){
    this.user = user;
   }

   public Date getDatelogin(){
    return datelogin;
   }

   public void setDateuser(){
    this.datelogin = datelogin;
   }

   @Override
   public int hashCode(){
    final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
   }

   /*O hashCode gera um número inteiro que representa o objeto.
Aqui você está dizendo:
"O código hash de um Login depende apenas do user".
Ou seja, se dois usuários têm o mesmo nome, o hashCode será igual. */

   @Override
public boolean equals(Object obj){
    if (this == obj)
        return true; // mesmo objeto na memória
    if (obj == null)
        return false; // não pode comparar com nulo
    if (getClass() != obj.getClass())
        return false; // só compara Login com Login
    Login other = (Login) obj;
    if (user == null) {
        if (other.user != null)
            return false;
    } else if (!user.equals(other.user))
        return false;
    return true;
}

    //Dois Login são iguais se tiverem o mesmo user, mesmo que o datelogin seja diferente.
}
