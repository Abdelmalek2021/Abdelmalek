'use strict'; 
(function() {

  function Person(firstName, lastName, age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.isAdult = function() {return this.age > 18 }
  }

  function Student(firstName, lastName, age, level){
    Person.call(this, firstName, lastName, age)
    this.level=level;
  }

  function Stagiaire(firstName, lastName, age, exp){
    Person.call(this, firstName, lastName, age)
    this.exp=exp;
  }

  Student.prototype = Object.create(Person.prototype);
  Stagiaire.prototype = Object.create(Person.prototype);
  let rishi = new Student('Rishi', 'BEN', 21, 5);
  display(rishi);
  let lolo = new Stagiaire('Name', 'LOLO', 21, 6);
  display(lolo);
})();