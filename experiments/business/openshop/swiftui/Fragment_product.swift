import SwiftUI

struct Fragment_product: View {
  var body: some View {
    ZStack {
      ScrollView {
        VStack(alignment: .center, spacing: 0) {
          ScrollView {
            LazyVStack(alignment: .leading, spacing: 4) {
              ForEach(1...10, id: \.self) { idx in
                VStack(alignment: .leading, spacing: 2) {
                  Text("Item \(idx)")
                  Text("Sub Item \(idx)")
                }
                Divider()
              }
            }
          }
          ScrollView(.horizontal, showsIndicators: false) {
            HStack(alignment: .center, spacing: 0) {
            }
            .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
          }
          ZStack {
            Group {
            Spacer()
            .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            Group {
            VStack(alignment: .leading, spacing: 0) {
              VStack(alignment: .leading, spacing: 0) {
                Text("Test product name").font(.system(size: 16)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
                ZStack {
                  Text("995 eur").font(.system(size: 15)).padding(6.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
                  Text("995 eur").font(.system(size: 15)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).padding(6.0).frame(maxWidth: .infinity, alignment: .center)
                  Text("-50%").font(.system(size: 15)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).padding(6.0).padding(.leading, 6.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
                }
                .frame(maxWidth: .infinity)
                .padding(.top, 6.0)
              }
              .frame(maxWidth: .infinity)
              .padding(.top, 8.0)
              Rectangle().foregroundColor(Color(red: 0.6549019607843137, green: 0.6549019607843137, blue: 0.6549019607843137, opacity: 0.8431372549019608))
              .background(Color(red: 0.6549019607843137, green: 0.6549019607843137, blue: 0.6549019607843137, opacity: 0.8431372549019608))
              .frame(height: 1.0)
              .padding(.top, 8.0)
              .padding(.bottom, 16.0)
              HStack(alignment: .center, spacing: 0) {
                Picker("", selection: .constant(0)) {
                  Text("Select").tag(0)
                  Text("Option 1").tag(1)
                  Text("Option 2").tag(2)
                  Text("Option 3").tag(3)
                }
                .pickerStyle(.menu)
                .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
                .frame(maxWidth: .infinity)
                .padding(.bottom, 8.0)
                .padding(.trailing, 10.0)
                Picker("", selection: .constant(0)) {
                  Text("Select").tag(0)
                  Text("Option 1").tag(1)
                  Text("Option 2").tag(2)
                  Text("Option 3").tag(3)
                }
                .pickerStyle(.menu)
                .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
                .frame(maxWidth: .infinity)
                .padding(.bottom, 8.0)
              }
              .frame(maxWidth: .infinity)
              ZStack {
                Text("ADD TO CART").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.leading, 3.0).frame(maxWidth: .infinity, alignment: .trailing)
                Image("cart_add").frame(maxWidth: .infinity, alignment: .leading)
              }
              .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
              .frame(maxWidth: .infinity)
              .padding(.leading, 16.0)
              .padding(.trailing, 16.0)
              .padding(.top, 16.0)
              Rectangle().foregroundColor(Color(red: 0.6549019607843137, green: 0.6549019607843137, blue: 0.6549019607843137, opacity: 0.8431372549019608))
              .background(Color(red: 0.6549019607843137, green: 0.6549019607843137, blue: 0.6549019607843137, opacity: 0.8431372549019608))
              .frame(height: 1.0)
              .padding(.top, 16.0)
              VStack(alignment: .leading, spacing: 0) {
                Text("").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 16.0)
                Button(action: { }) {
                  Text("SEND TO A FRIEND").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
                }
                .disabled(false)
                .buttonStyle(.plain)
                .background(Image("button_facebook_style").resizable().scaledToFill())
                .frame(maxWidth: .infinity)
                Text("RECOMMENDED").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 16.0)
              }
              .frame(maxWidth: .infinity)
              .padding(16.0)
              ScrollView {
                LazyVStack(alignment: .leading, spacing: 4) {
                  ForEach(1...10, id: \.self) { idx in
                    VStack(alignment: .leading, spacing: 2) {
                      Text("Item \(idx)")
                      Text("Sub Item \(idx)")
                    }
                    Divider()
                  }
                }
              }
              .frame(maxWidth: .infinity)
              .frame(height: 220.0)
            }
            .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          }
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(width: 60.0, height: 60.0)
      .padding(10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      ProgressView().padding(.top, 50.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_product_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_product()
  }
}
