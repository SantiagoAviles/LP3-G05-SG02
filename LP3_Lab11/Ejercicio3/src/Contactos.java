public class Contactos {
   private Dictionary<String, Contacto> contacts;

   public Contactos() {
       this.contacts = new Dictionary<>();
   }

   public void addContacto(String dni, Contacto contacto) {
       contacts.add(dni, contacto);
   }

   public Contacto getContacto(String dni) throws ObjectDoesntExist {
       return contacts.getValue(dni);
   }

   public boolean deleteContacto(String dni) {
       return contacts.delete(dni);
   }
}

