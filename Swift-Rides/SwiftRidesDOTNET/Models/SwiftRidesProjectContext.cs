using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace SwiftRides.Models;

public partial class SwiftRidesProjectContext : DbContext
{
    public SwiftRidesProjectContext()
    {
    }

    public SwiftRidesProjectContext(DbContextOptions<SwiftRidesProjectContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Booking> Bookings { get; set; }

    public virtual DbSet<CarCompany> CarCompanies { get; set; }

    public virtual DbSet<CarModel> CarModels { get; set; }

    public virtual DbSet<City> Cities { get; set; }

    public virtual DbSet<CoPassenger> CoPassengers { get; set; }

    public virtual DbSet<Login> Logins { get; set; }

    public virtual DbSet<PassengersReview> PassengersReviews { get; set; }

    public virtual DbSet<Payment> Payments { get; set; }

    public virtual DbSet<Ride> Rides { get; set; }

    public virtual DbSet<Role> Roles { get; set; }

    public virtual DbSet<State> States { get; set; }

    public virtual DbSet<User> Users { get; set; }

    public virtual DbSet<Vehicle> Vehicles { get; set; }
}