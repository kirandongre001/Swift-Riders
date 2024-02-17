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

protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySql("server=localhost;port=3306;user=root;password=root;database=swiftrides", Microsoft.EntityFrameworkCore.ServerVersion.Parse("8.0.31-mysql"));

 protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder
            .UseCollation("utf8mb4_0900_ai_ci")
            .HasCharSet("utf8mb4");

        modelBuilder.Entity<Booking>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("booking");

            entity.HasIndex(e => e.RideId, "ride_id_fk_idx");

            entity.HasIndex(e => e.PassengerId, "user_id_fk1_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.NoOfSeats).HasColumnName("no_of_seats");
            entity.Property(e => e.PassengerId).HasColumnName("passenger_id");
            entity.Property(e => e.RideId).HasColumnName("ride_id");
            entity.Property(e => e.Status)
                .HasMaxLength(100)
                .HasColumnName("status");
            entity.Property(e => e.Time)
                .HasMaxLength(6)
                .HasColumnName("time");
            entity.Property(e => e.TotalPrice).HasColumnName("total_price");

            entity.HasOne(d => d.Passenger).WithMany(p => p.Bookings)
                .HasForeignKey(d => d.PassengerId)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("user_id_fk1");

            entity.HasOne(d => d.Ride).WithMany(p => p.Bookings)
                .HasForeignKey(d => d.RideId)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("ride_id_fk");
        });
    }

}