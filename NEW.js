<script>
    function validate() {
        var firstName = document.getElementByid("fname").value;
        var lastName = document.getElementByid("lname").value;
        if(firstName =="" || firstName ==""){
            alert("please enter first name");
            } else if(lastName=="" || lastName == ""){

            }alert("please enter last name");
            } else {
            alert("success")

            }
        }
</script>