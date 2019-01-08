<!--
      // Form validation code will come here.
      function validateForm() {
      
         if( document.feedback.names.value == "" ) {
            alert( "Please provide your name!" );
            document.feedback.names.focus() ;
            return false;
         }
         if( document.feedback.email.value == "" ) {
            alert( "Please provide your email!" );
            document.feedback.email.focus() ;
            return false;
         }
         if( document.feedback.phone.value == "" || isNaN( document.feedback.phone.value ) ||
            document.feedback.phone.value.length != 10) {
            
            alert( "Please provide a phone number in the format #####." );
            document.feedback.phone.focus() ;
            return false;
         }
         return( true );
      }
   //-->