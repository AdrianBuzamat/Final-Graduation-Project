$(document).ready(() => {
    $("#myInput").on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $("#myTable tr").filter(function () {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });

    $('#add-button-modal').click(() => {
        const firstName = $('#modal-firstName').val();
        const lastName = $('#modal-lastName').val();
        const phoneNumber = $('#modal-phoneNumber').val();
        const city = $('#modal-city').val();
        const institution = $('#modal-institution').val();
        const dateTime = $('#modal-date').val();

        const newReservation = {
            person: {
                firstName: firstName,
                lastName: lastName,
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

        // alert("Saving" + JSON.stringify(newReservation));

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
    });

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

});