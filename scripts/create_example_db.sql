USE [master]
GO

/****** Object:  Database [exampledb]    Script Date: 9/4/2016 6:12:31 PM ******/
CREATE DATABASE [exampledb]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'exampledb', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\exampledb.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'exampledb_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\exampledb_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO

ALTER DATABASE [exampledb] SET COMPATIBILITY_LEVEL = 130
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [exampledb].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [exampledb] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [exampledb] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [exampledb] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [exampledb] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [exampledb] SET ARITHABORT OFF 
GO

ALTER DATABASE [exampledb] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [exampledb] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [exampledb] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [exampledb] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [exampledb] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [exampledb] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [exampledb] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [exampledb] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [exampledb] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [exampledb] SET  DISABLE_BROKER 
GO

ALTER DATABASE [exampledb] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [exampledb] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [exampledb] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [exampledb] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [exampledb] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [exampledb] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [exampledb] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [exampledb] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [exampledb] SET  MULTI_USER 
GO

ALTER DATABASE [exampledb] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [exampledb] SET DB_CHAINING OFF 
GO

ALTER DATABASE [exampledb] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [exampledb] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [exampledb] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [exampledb] SET QUERY_STORE = OFF
GO

USE [exampledb]
GO

ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO

ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO

ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO

ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO

ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO

ALTER DATABASE [exampledb] SET  READ_WRITE 
GO
