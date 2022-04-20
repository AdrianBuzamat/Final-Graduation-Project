$(document).ready(() => {
    let reservationToEdit;

    $("#myInput").on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $("#myTable tr").filter(function () {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });

    $('#add-button-modal').click(() => {
        const fullName = $('#modal-fullName').val();
        const phoneNumber = $('#modal-phoneNumber').val();
        const city = $('#modal-city').val();
        const institution = $('#modal-institution').val();
        const dateTime = $('#modal-date').val();

        const newReservation = {
            person: {
                fullName: fullName,
                phoneNumber: phoneNumber
            },
            city: {
                name: city
            },
            institution: {
                name: institution
            },
            date: dateTime
        };

        if (reservationToEdit == null){
            addReservation(newReservation);
        } else {
            editReservation(reservationToEdit, newReservation)
        }
    });

    function editReservation(id, newReservation){
        fetch('api/reservations' + id, {
            method: 'PUT',
            body: JSON.stringify(newReservation),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response => {
            if (response.ok) {
                location.reload();
            } else {
                alert("There are errors " + response.status);
            }
        });
    }

    function addReservation(newReservation){
        fetch('api/reservations', {
            method: 'POST',
            body: JSON.stringify(newReservation),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response => {
            if (response.ok) {
                location.reload();
            } else {
                alert("There are errors " + response.status);
            }
        });
    }

    $('#edit-icon').click(function (){

        reservationToEdit=this.parentElement.id;

        const fullName = $('#card-person-name')[0].innerText;
        const phoneNumber = $('#card-person-phoneNumber')[0].innerText;
        const city = $('#card-city-name')[0].innerText;
        const institution = $('#card-institution-name')[0].innerText;
        const dateTime = $('#card-reservation-date')[0].innerText;

//        alert('Puting' +fullName + phoneNumber+ city + institution + dateTime);

         $('#modal-fullName').val(fullName);
         $('#modal-phoneNumber').val(phoneNumber);
         $('#modal-city').val(city);
         $('#modal-institution').val(institution);
         $('#modal-date').val(dateTime);

    })

    $('.delete-icon').click(function () {
        const reservationId = this.parentElement.id;

        fetch('api/reservations/' + reservationId, {
            method: 'DELETE'
        }).then(response => {
            if (response.ok) {
                location.reload();
            } else {
                alert("There are errors " + response.status);
            }
        });
    });

    $(document).ready(function(){
        $('[data-toggle="tooltip"]').tooltip();
    });

    $('#add-reservation-button').click(function () {
        reservationToEdit = null;
        clearModal();
    });
    function clearModal() {

        $('#modal-fullName').val('');
        $('#modal-phoneNumber').val('');
        $('#modal-city').val();
        $('#modal-institution').val();
        $('#modal-date').val('');
    }
});